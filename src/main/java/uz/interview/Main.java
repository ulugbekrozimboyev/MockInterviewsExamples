package uz.interview;

import uz.interview.dto.Student;

import java.util.HashMap;

public class Main {

    private static Integer counter = 1;

    public static void main(String[] args){
        HashMap<Student, Integer> map = new HashMap<>();
        map.put(new Student("ali", "", 25), 1);
        map.put(new Student("bali", "", 25), 1);
        map.put(new Student("vali", "", 25), 2);
        System.out.println(map);

        map.keySet().stream().filter(item -> item.getAge() > 10);

        // threads example
        MyThread thread = new MyThread();
        Thread thread1 = new Thread(thread);
        thread1.start();

        Thread thread2 = new Thread(thread);
        thread2.start();

    }

    public static class MyThread extends Thread {
        @Override
        public void run(){
            try {
                myFunc();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public synchronized void myFunc() throws InterruptedException {
            System.out.println(Thread.currentThread().getName() + " start");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " finished");
        }

    }
}
