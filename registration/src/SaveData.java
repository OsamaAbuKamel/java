import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class DataFromSignUp {
    private String firstName;
    private String lastName;
    private String Email;
    private String Password;
    private String gender;
    private String Country;
    private NewDate date;

    public DataFromSignUp() {
    }

    public DataFromSignUp(String firstName, String lastName, String Email, String Password, String gender,
            String Country,
            NewDate date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
        this.Password = Password;
        this.gender = gender;
        this.Country = Country;
        this.date = date;
    }

    public NewDate getDate() {
        return date;
    }

    public void setDate(NewDate date) {
        this.date = date;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return this.Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    @Override
    public String toString() {
        return "{" +
                " firstName='" + getFirstName() + "'" +
                ", lastName='" + getLastName() + "'" +
                ", Email='" + getEmail() + "'" +
                ", Password='" + getPassword() + "'" +
                ", gender='" + getGender() + "'" +
                ", Country='" + getCountry() + "'" +
                ", date='" + getDate() + "'" +
                "}";
    }

}

public class SaveData {
    ArrayList<DataFromSignUp> data;
    File myObj = new File("output.txt");

    public SaveData() {
        data = new ArrayList<DataFromSignUp>();
    }

    public void addData(String firstName, String lastName, String email, String password, String gender,
            String country) {
        DataFromSignUp signUp = new DataFromSignUp(firstName, lastName, email, password, gender, country,
                new NewDate());
        data.add(signUp);
    }

    public ArrayList<DataFromSignUp> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "{" +
                " data='" + getData() + "'" +
                "}";
    }

    public void printDataInFile() {
        try {
            FileWriter fw = new FileWriter(myObj, true);
            for (DataFromSignUp dataFromSignUp : data) {
                fw.write(dataFromSignUp.toString() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void read() {
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isDataAlreadyExists(String s) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Check if the line contains the email
                if (line.contains(s)) {
                    return true; // Email already exists
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Email doesn't exist
    }
}
