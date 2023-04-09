public class Thread04 {
    /**
     *     在这个示例中，有两个线程：一个生产者线程和一个消费者线程。它们之间通过 Message 对象来通信。
     *
     *     Message 类中有两个方法：read() 和 write()。这两个方法都是同步方法，并且使用了 wait()、notify() 和 notifyAll() 方法来实现线程通信。
     *
     *     Producer 类和 Consumer 类都实现了 Runnable 接口，它们分别在自己的线程中运行。Producer 线程在运行时向 Message 对象中写入一些字符串消息，并且每写入一条消息就休眠 1 秒钟。当 Producer 线程写入完所有的消息后，它会向 Message 对象中写入一个特殊的消息 "EOF"，表示消息已经全部写入完毕。然后 Producer 线程结束运行。
     *
     *     Consumer 线程在运行时从 Message 对象中读取消息，并且每读取一条消息就休眠 1 秒钟。当 Consumer 线程读取到 "EOF" 消息时，它停止读取并结束运行。
     *
     *     这个示例中的线程通信过程是这样的：
     *
     *     初始时，Message 对象中的 available 标志为 false，表示没有消息可供消费；
     *     Producer 线程在运行时向 Message 对象中写入第一条消息，并将 available 标志设置为 true，然后调用 notify() 方法，唤醒 Consumer 线程；
     *     Consumer 线程被唤醒后，读取到第一条消息，并将 available 标志设置为 false，然后调用 notify() 方法，唤醒 Producer 线程；
     *     Producer 线程被唤醒后，向 Message 对象中写入第二条消息，并将 available 标志设置为 true，然后调用 notify() 方法，唤醒 Consumer 线程；
     *     Consumer 线程被唤醒后，读取到第二条消息，并将 available 标志设置为 false，然后调用 notify() 方法，唤醒 Producer 线程；
     *     重复上述过程，直到 Producer 线程向 Message 对象中写入 "EOF" 消息为止。
     */
    public static void main(String[] args) {
        Message message = new Message();

        Thread producer = new Thread(new Producer(message));
        Thread consumer = new Thread(new Consumer(message));

        producer.start();
        consumer.start();
    }

    static class Message {
        private String content;
        private boolean available = false;

        public synchronized String read() {
            while (!available) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            available = false;
            notify();
            return content;
        }

        public synchronized void write(String content) {
            while (available) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.content = content;
            available = true;
            notify();
        }
    }

    static class Producer implements Runnable {
        private Message message;

        public Producer(Message message) {
            this.message = message;
        }

        @Override
        public void run() {
            String[] messages = {"Message 1", "Message 2", "Message 3"};

            for (String message : messages) {
                this.message.write(message);
                System.out.println("Produced: " + message);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            this.message.write("EOF");
            System.out.println("Producer finished.");
        }
    }

    static class Consumer implements Runnable {
        private Message message;

        public Consumer(Message message) {
            this.message = message;
        }

        @Override
        public void run() {
            String message;
            do {
                message = this.message.read();
                System.out.println("Consumed: " + message);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (!message.equals("EOF"));

            System.out.println("Consumer finished.");
        }
    }
}

