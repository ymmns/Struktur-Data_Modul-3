package Task2;
import java.util.Scanner;

public class Drivers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Ask the user for the maximum size of the queue
        System.out.print("Masukkan Maksimal Antrian Pemesanan: ");
        int maxSize = sc.nextInt();
        QueueManuals queue = new QueueManuals(maxSize);

        // Ask the user for the number of elements to add to the queue
        System.out.print("Masukkan Jumlah Data Yang Akan Di Masukkan Dalam Antrian: ");
        int numElements = sc.nextInt();

        System.out.println("Masukkan " + numElements + " Data:");
        for (int i = 0; i < numElements; i++) {
            System.out.print("Masukkan Nama: ");
            String str = sc.next();
            System.out.print("Masukkan Nomor Hp: ");
            int num = sc.nextInt();
            Object[] item = {str, num};
            queue.enqueue(item);
            System.out.println("Telah Terdaftar: " +str+" , " +num);
        }

        // Dequeue all elements from the queue
        System.out.println("Mengeluarkan Data Yang Telah Di Masukkan:");
        while (!queue.isEmpty()) {
            Object[] item = (Object[]) queue.dequeue();
            String str = (String) item[0];
            int num = (int) item[1];
            System.out.println("Nama: " + str + ", Nomor Hp: " + num);
        }
    }
}
