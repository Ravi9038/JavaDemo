import java.io.*;

class ReverseArray{

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i;
        int j;
        System.out.println(
            "Enter the Size of Array"
        );
        int arrSize = Integer.parseInt(br.readLine());
        
        int arr[] = new int[arrSize];
        System.out.println("Enter the array Element");

        for (i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //reverse logic
        j = i -1;
        i = 0;
        
        while(i < j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        //Printing array

        System.out.println("Reverse Array");

        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}

/**
 * 
 * PS C:\Users\ravi>  & 'c:\Users\ravi\.vscode\extensions\vscjava.vscode-java-debug-0.31.0\scripts\launcher.bat' 'C:\Program Files\AdoptOpenJDK\jdk-11.0.10.9-hotspot\bin\java.exe' '-Dfile.encoding=UTF-8' '-cp' 'C:\Users\ravi\AppData\Local\Temp\vscodesws_d0c48\jdt_ws\jdt.ls-java-project\bin' 'ReverseArray'
Enter the Size of Array
5
Enter the array Element
1
2
3
4
5
Reverse Array
5
4
3
2
1
PS C:\Users\ravi> 
 */