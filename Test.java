import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        ArrayList<Participant> participants = new ArrayList<Participant>();
        participants.add(new Participant("P1", "01-01-2000", "10:10:10", getHeartRate("p1")));
        participants.add(new Participant("P2", "08-09-2022", "21:09:32", getHeartRate("p2")));
        participants.add(new Participant("P3", "11-02-2001", "12:00:12", getHeartRate("p3")));
        participants.add(new Participant("P4", "02-09-2006", "00:34:21", getHeartRate("p4")));
        participants.add(new Participant("P5", "12-10-2004", "03:58:23", getHeartRate("p5")));

        System.out.println("Participant ID\t\tDate of Data Collection\t\tTime of Data Collection\t\tHeart Rate");
        for(Participant element : participants) {
            System.out.println(element);
        }

        try {
            Test.wrutetiFuke(participants);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     }

    public static int getHeartRate(String ID) {
        String filename = ID + ".txt";
        int currentRR;
        int sumRR = 0;
        int counter = 0;
        int meanRR;
        int HR;

        File newFile = new File(filename);
        Scanner sc;
        try {
            sc = new Scanner(newFile);
            while(sc.hasNextInt()) {
                currentRR = sc.nextInt();
                sumRR += currentRR;
                counter ++;
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("An error occured");
        }
        meanRR = sumRR / counter;
        HR = (60 * 1000) / meanRR;
        return HR;

    }

    public static void wrutetiFuke(ArrayList<Participant> list) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("OUTPUT.txt");
        for(Participant p: list){
            pw.write(p.toString()+"\n");
        };
        pw.close();
    }
}

