import java.io.*;

public class file {
    public static void main(String [] args) {

        int recCount=0;

        String fileName = "/etc/passwd";
        System.out.println("{\"Accounts\": {\n");
        String line = null;

        try {
            FileReader fileReader =
                new FileReader(fileName);

            BufferedReader bufferedReader =
                new BufferedReader(fileReader);

                System.out.println("{\"Accounts\": {");

            while((line = bufferedReader.readLine()) != null) {
                recCount++;
                String strArray[] = line.split(":");

                for(int i=0; i < strArray.length; i++){
                if (i == 0)
                System.out.println("   \"user\": {");
                if (i == 0)
                System.out.println("       \"username\": \"" + strArray[i] + "\",");
                if (i == 1)
                System.out.println("       \"password\": \"" + strArray[i] + "\",");
                if (i == 2)
                System.out.println("       \"uid\": " + strArray[i] + ",");
                if (i == 3)
                System.out.println("       \"gid\": " + strArray[i] + ",");
                if (i == 4)
                System.out.println("       \"dir\": \"" + strArray[i] + "\",");
                if (i == 5)
                System.out.println("       \"shell\": \"" + strArray[i] + "\",");
                if (i == 5)
                System.out.println("       },");


                }

            }

            bufferedReader.close();
        }

        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" +
                fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '"
                + fileName + "'");
        }

        System.out.println("\"TotalAccounts\":" + recCount);
        System.out.println("}}");

    }


}
