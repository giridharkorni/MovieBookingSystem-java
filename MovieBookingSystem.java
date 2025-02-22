import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class cls
{
	static void loading()
	{
		String load= ". . . . . . . . . ";
		for(int i=0;i<load.length();i++)
		{
			System.out.print(load.charAt(i));
			sleep(150);
		}
	}
	static void sleep(int n)
	{
		try{
		Thread.sleep(n);
			}
		catch(InterruptedException e)
			{}
	}
	static  Scanner sc = new Scanner(System.in);
	static final String red = "\u001B[31m";
	static final String green  = "\u001B[32m";
	static final String magent = "\u001B[95m";
	static final String blue = "\u001B[34m";
	static final String purple = "\u001B[35m";
	static final String cyan = "\u001B[36m";
	static final String black = "\u001B[30m";
	static final String yellow = "\u001B[93m";
    static final String white = "\033[0;37m";
	static final String reset = "\u001B[0m";
    static final String redbr = "\033[0;91m";  
    static final String greenbr = "\033[0;92m"; 
    static final String whitebr = "\033[0;97m";
    static final String redbri = "\033[1;91m";   
    static final String greenbri = "\033[1;92m";
	static final String bluebri = "\033[0;94m"; 
	static final String bwhite = "\u001B[107m";
	static final String orange = "\033[38;5;214m";
	static String bgreen="\u001B[42m";
	static String byellow="\u001B[43m";
	static String bblue="\u001B[44m";
	static String bpurple="\u001B[45m";
	static String bcyan="\u001B[46m";
	static String change="\u001B[7m";
	static String thick="\u001B[1m";
	static String breset = "\u001B[49m";
	static final String ul = "\u001B[4m";
	static final String rstul = "\u001B[24m";
	static final String blink="\u001B[5m";
	static final String rstblink = "\u001B[0m";
    static final String ital = "\u001B[3m";

	static int  otp(String use)
    {
        int otp=1000+(int)(Math.random()*8999);
        System.out.println("\t\t\t\tBuddy - "+otp+"\t\t\t\t\t\n"+use);
        return otp;
    }


}

class userAccount
{
    private String username="cvcorp";
    private String password="Krishna@99";
    private String phno="9123456789";
    userAccount(String username , String password)
    {
        this.username=username;
        this.password=password;
    }
    userAccount (String username,String password,String phno)
    {
        this.username=username;
        this.password=password;
        this.phno=phno;
    }
    void setName(String username)
    {
        this.username=username;
    }
    void setPass(String password)
    {
        this.password=password;
    }
    void setnum(String phno)
    {
        this.phno=phno;
    }
    String getName()
    {
        return username;
    }
    String getPass()
    {
        return password;
    }
    String getPh()
    {
        return phno;
    }
    userAccount(){}
}

class USER
{
    static Scanner sc=new Scanner(System.in);
    static userAccount x=new userAccount();
    MovieBookingSystem system=new MovieBookingSystem();  
    void login()
    {
        System.out.println("");
        System.out.println(cls.purple + "\n\t\t\t\t\tW E L C O M E     T O    Login Page\n" + cls.reset);
        System.out.println("\n\t\t\t\t\tEnter Account Details : \n");
        System.out.print("\n\t\t\t\t\tUsername  :  ");
        String name = cls.sc.nextLine();
        System.out.println();
        System.out.print("\n\t\t\t\t\tPassword  :  ");
        String pass = cls.sc.nextLine();
        System.out.println();

        if (name.equals(x.getName()) && pass.equals(x.getPass())) {
            System.out.println(cls.blue + "\n\t\t\t\t\t...........      Login successful     ...........\n\n\n\n" + cls.reset);
        } else if (!(name).equals(x.getName()) || !(pass).equals(x.getPass())) {
            System.out.println(cls.red + "\n\t\t\t\t\t..........     Invalid Username or Password     ...........\n\n" + cls.reset);

            // Instead of using an infinite loop, we ask for mobile input and validate
            while (true) {
                System.out.print("\n\t\t\t\t\tEnter Your Mobile Number : ");
                String no = sc.nextLine();

                // Validate mobile number input
                if (no.length() == 10 && no.matches("\\d+")) { // Ensure it's numeric and 10 digits
                    if (no.equals(x.getPh())) {
                        System.out.println(cls.yellow + "\n\t\t\t\t\tSelect Options : \n" + cls.reset);
                        System.out.println("\n\t\t\t\t\t\t1 . Retry Login");
                        System.out.println("\n\t\t\t\t\t\t2 . Reset your Credentials...");
                        System.out.print(cls.yellow+"\t\t\t\t\tEnter your choice : "+cls.reset);
                        String sel = cls.sc.nextLine();
                        
                        if (sel.matches("\\d+")) { // Ensure input is numeric
                            int n = Integer.parseInt(sel); // Parse it to integer
                            if (n == 1) {
                                login();
                                break;
                            } else if (n == 2) {
                                System.out.print("\n\t\t\t\t\tEnter Your Mobile Number : ");
                                String rstph = cls.sc.nextLine();
                                if (rstph.equals(x.getPh())) {
                                    System.out.print(cls.yellow+"\n\t\t\t\t\tPlease Wait, We are sending OTP to your Number"+cls.reset);
                                    cls.loading();
                                    System.out.println();
                                    int sentotp = cls.otp(cls.green+"\t\t\t\t\tResetting Username and Password"+cls.reset);
                                    System.out.print("\n\t\t\t\t\tEnter Your OTP  : ");
                                    String user_otp = cls.sc.nextLine();
                                    if (user_otp.equals(Integer.toString(sentotp))) {
                                        System.out.println(cls.yellow+"\t\t\t\t\tEnter your Details....... "+cls.reset);
                                        System.out.print("\n\t\t\t\t\t\tNew Username    :   ");
                                        String new_username = cls.sc.nextLine();
                                        System.out.print("\n\t\t\t\t\t\tNew Password    :   ");
                                        String new_password = cls.sc.nextLine();
                                        x = new userAccount(new_username, new_password);
                                        System.out.print(cls.yellow+"\t\t\t\t\tYou're Redirecting to Login Page "+cls.reset);
                                        cls.loading();
                                        System.out.println("");
                                        login();
                                        break;
                                    } else {
                                        System.out.println(cls.red + "..........       Incorrect OTP     ............" + cls.reset);
                                        System.out.println(cls.green + "Open the Application Again" + cls.reset);
                                    }
                                } else {
                                    System.out.println(cls.redbr + "\n\t\t\t\t............             Invalid Mobile Number             ............" + cls.reset);
                                    System.out.println(cls.yellow + "\n\t\t\t\t\tSelect one Option : " + cls.reset);
                                    System.out.println("\n\t\t\t\t\t\t1 . Create a new account ");
                                    System.out.println("\t\t\t\t\t\t2 . Re-enter Mobile Number ");
                                    System.out.println("\n\t\t\t\t\t\t3 . Enter any thing to exit ");
                                    System.out.print("\n\t\t\t\t\tEnter your Choice : ");
                                    String opt = cls.sc.nextLine();
                                    if (opt.matches("\\d+")) { // Check if input is numeric
                                        int k = Integer.parseInt(opt); // Parse it to integer
                                        if (k == 1) {
                                            signup();
                                            break;
                                        } else if(k==2)
                                        {
            
                                        }
                                        else{
                                            System.out.println(cls.green+cls.blink+"\n\t\t\t\t\tOpen Application Again..."+cls.reset);
                                            System.exit(0);
                                        }
                                    } else {
                                        System.out.println(cls.red + "\n\t\t\t\tInvalid input, please enter a valid number." + cls.reset);
                                    }
                                }
                            } else {
                                System.out.println(cls.red + "\t\t\t\tSorry, You've Entered Invalid Input............." + cls.reset);
                                System.out.println(cls.green + "\t\t\t\tOpen the application again............" + cls.reset);
                                Verification.ys = false;
                                break;
                            }
                        }
                    }
                    else
                    {
                        System.out.println(cls.red + "\n\t\t\t\t\tSorry, You've Entered Wrong Mobile Number ........"+cls.reset);
                        System.out.println(cls.yellow + "\n\t\t\t\t\tSelect one Option : " + cls.reset);
                        System.out.println("\n\t\t\t\t\t\t1 . Create a new account ");
                        System.out.println("\n\t\t\t\t\t\t2 . Re-enter Mobile Number ");
                        System.out.println("\n\t\t\t\t\t\t3 . Enter any thing to exit ");
                        System.out.print("\n\t\t\t\t\tEnter your Choice : ");
                        String opt1 = cls.sc.nextLine();
                        if (opt1.matches("\\d+")) { // Check if input is numeric
                        int k = Integer.parseInt(opt1); // Parse it to integer
                        if (k == 1) {
                            signup();
                            break;
                            }
                            else if(k==2)
                            {

                            }
                            else{
                                System.out.println(cls.green+cls.blink+"\n\t\t\t\t\tOpen Application Again..."+cls.reset);
                                System.exit(0);
                            }
                        }
                    }
                } else {
                    System.out.println(cls.red + "\n\t\t\t\t\t.......... Invalid Mobile Number ..........." + cls.reset);
                    System.out.println(cls.yellow + "\n\t\t\t\t\tDo You want to re-enter : " + cls.reset);
                    System.out.println("\n\t\t\t\t\t\t1 . Yes ");
                    System.out.println("\n\t\t\t\t\t\t2 . No");
                    System.out.print("\n\t\t\t\t\t\tEnter your Choice : ");
                    String ys = cls.sc.nextLine();
                    if (ys.equals("1")) {
                        continue;
                    } else {
                        Verification.ys = false;
                        System.out.print(cls.green+"\t\t\t\t\tOpen Application Again!.."+cls.reset);
                        System.exit(0);
                        break;
                    }
                }
            }
        }
    }
	String mobile()
	{
		System.out.print("\n\t\t\t\t\t\tMobile Number  :  ");
        String phno = sc.nextLine();
		if(phno.length()==10 && phno.charAt(0)>='6'  &&  phno.charAt(0)<='9')
		{
			for(int i=0;i<phno.length();i++)
			{
				if(phno.charAt(i)>='0'  &&  phno.charAt(i)<='9')
					continue;
				else
				{
					System.out.println(cls.red+"\n\t\t\t.........     Your Number should contain only 10 numeric Digits   ........."+cls.reset);
					System.out.println(cls.yellow+"\n\t\t\t\t\tDo you want to Re-enter :"+cls.reset);
					System.out.println("\n\t\t\t\t\t\t1 . Yes");
					System.out.println("\n\t\t\t\t\t\t2 . No");
					System.out.print("");
					String ys = cls.sc.nextLine();
					if(Integer.parseInt(ys)==1)
						return mobile();
					else
					{
						Verification.ys=false;
						return null;
					}
				}
			}
			return phno;
		}
		else
		{
			System.out.println(cls.red+"\n\t\t.........     Your Number should contain only 10 numeric digits and starting value should be between 6 to 9   ........."+cls.reset);
			System.out.println(cls.yellow+"\n\t\t\t\t\tDo you want to Re-enter :"+cls.reset);
			System.out.println("\n\t\t\t\t\t\t1 . Yes");
			System.out.println("\n\t\t\t\t\t\t2 . No, exit");
            System.out.print("\n\t\t\t\t\t\tEnter your Choice : ");
			String ys = cls.sc.nextLine();
			if(Integer.parseInt(ys)==1)
				return mobile();
			else
			{
				Verification.ys=false;
                System.out.println(cls.red+"terminating the code..."+cls.reset);
                System.exit(0);
                return null;
			}
		}
	}
    void signup() {
        System.out.println(cls.purple + "\n\t\t\t\t\t    W E L C O M E     T O     M O V I E S   W O R L D    " + cls.reset);
        System.out.println();
        System.out.println(cls.yellow + "\n\t\t\t\t\tEnter Account Details : " + cls.reset);
        System.out.print("\n\t\t\t\t\t\tUsername       :  ");
        String name = cls.sc.nextLine();
        String pass = "";
        
        // Loop for password validation
        while (true) {
            System.out.print("\n\t\t\t\t\t\tPassword       :  ");
            pass = cls.sc.nextLine();
            
            // Check if the password meets the criteria
            if (!pass.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!])[A-Za-z\\d@#$%^&+=!]{8,20}$")) {
                System.out.println(cls.green+"\n\t\t\tEnter Strong Password (at least 8 characters, 1 uppercase, 1 lowercase, 1 digit, 1 special character)"+cls.reset);
            } else {
                break; // Password is valid, break the loop
            }
        }
        
        // Check if username or password is empty
        if (name.isEmpty() || pass.isEmpty()) {
            System.out.println(cls.red + "\n\t\t\t\t.........     Username or Password Can't Be empty   ..........." + cls.reset);
            System.out.println(cls.yellow + "\n\t\t\t\t\tDo you want to Re-enter : " + cls.reset);
            System.out.println("\n\t\t\t\t\t\t1 . Yes");
            System.out.println("\n\t\t\t\t\t\t2 . No");
            System.out.print("");
            String ys1 = cls.sc.nextLine();
            if (Integer.parseInt(ys1) == 1) {
                signup();
                return;
            } else {
                return;
            }
        }
    
        String phno = mobile();
        if (phno == null) {
            Verification.ys = false;
            return;
        }
        x = new userAccount(name, pass, phno);
        
        while (true) {
            System.out.println(cls.cyan + "\n\t\t\t\tPlease Wait We are sending OTP for your Number" + cls.reset);
            cls.loading();
            System.out.println();
            System.out.println(cls.red+"\t\t\t\tNote - Please DO NOT share this anyone.\n"+cls.reset);
            int sentotp = cls.otp(cls.purple + "\n\t\t\t\t\tCreating New Account in Movies World" + cls.reset);
            System.out.print(cls.yellow + "\n\t\t\t\t\tEnter Your OTP  : " + cls.reset);
            String user_otp = cls.sc.nextLine();
            if (user_otp.equals(Integer.toString(sentotp))) {
                cls.sleep(500);
                System.out.println(cls.blue + "\n\t\t\t\t..........     Your Account has been created Successfully       ............\n" + cls.reset);
                System.out.println(cls.yellow + "\n\t\t\t\t\t  Please log in again " + cls.reset);
                login();
                break;
            } else {
                System.out.println(cls.red + "\n\t\t\t\t\t..........     Invalid OTP     ............" + cls.reset);
                System.out.println(cls.yellow + "\n\t\t\t\t\tDo You want to resend OTP" + cls.reset);
                System.out.println("\n\t\t\t\t\t\t1 . Yes");
                System.out.println("\n\t\t\t\t\t\t2 . No, exit");
                System.out.print("\n\t\t\t\t\tEnter the value : ");
                String ys = cls.sc.nextLine();
                if (Integer.parseInt(ys) == 1)
                    continue;
                else {
                    System.out.println(cls.red + "\n\t\t\t\t\t...........     Verification Failed, terminating the code     ............\n" + cls.reset);
                    Verification.ys = false;
                    System.exit(0);
                }
            }
        }
    }
    
}
class Verification extends USER
{
    static boolean ys = true;
    static Verification user_ob = new Verification();
    boolean validation()
    {
        System.out.println(cls.yellow+"\n\t\t\t\t\tSelect Options : \n\n"+cls.reset);
        System.out.println("\n\t\t\t\t\t\t1 . Log in to your Account..\n");
        System.out.println("\n\t\t\t\t\t\t2 . Create a new Account..\n");
        System.out.print(cls.yellow+"\n\t\t\t\t\tEnter your Choice : "+cls.reset);
        String opt = cls.sc.nextLine();
    
        // Check if the input is a valid number
        if (opt.equals("1")) {
            user_ob.login();
        } else if(opt.equals("2")) {
            user_ob.signup();
        } else {
            System.out.println(cls.red + "\n\t\t\t\t\t.......... Invalid Input! Please enter a Valid Option. ............" + cls.reset);
            System.out.println(cls.green + "\n\t\t\t\t\tRe-enter the input again..." + cls.reset);
            validation(); // Call again to re-enter valid input
        }
        return ys;
    }
    
}

class Theatre {
    private String name;
    private List<String> showtimes;  

    public Theatre(String name) {
        this.name = name;
        this.showtimes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getShowtimes() {
        return showtimes;
    }

    public void addShowtime(String showtime) {
        showtimes.add(showtime);
    }

    public void displayShowtimes() {
        System.out.println(cls.yellow+"\n\n\t\t\t\t\tShowtimes for " + name + ":"+cls.reset);
        for (int i = 0; i < showtimes.size(); i++) {
            System.out.println("\n\t\t\t\t\t\t" + (i + 1) + ". " + showtimes.get(i));
        }
    }
}

// Abstract Snack class
abstract class Snack {
    private String name;
    private int price;

    public Snack(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public abstract void showSnackInfo();
}

// Concrete Snack classes
class Popcorn extends Snack {
    public Popcorn(String name, int price) {
        super(name, price);
    }

    @Override
    public void showSnackInfo() {
        System.out.println("\n\t\t\t\t\tSnack: " + getName() + "  -  Rs." + getPrice());
    }
}

class FrenchFries extends Snack {
    public FrenchFries(String name, int price) {
        super(name, price);
    }

    
    public void showSnackInfo() {
        System.out.println("\n\t\t\t\t\tSnack: " + getName() + "  -  Rs." + getPrice());
    }
}

class Coke extends Snack {
    public Coke(String name, int price) {
        super(name, price);
    }

    @Override
    public void showSnackInfo() {
        System.out.println("\n\t\t\t\t\tSnack: " + getName() + "  -  Rs." + getPrice());
    }
}

// Seat class
class Seat {
    private String seatNumber;
    private boolean isBooked;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void book() {
        isBooked = true;
    }
}

class PaymentMethod {
    private String bankName;
    private String pin;
    private double amount;

    public PaymentMethod(String bankName, String pin, double amount) {
        this.bankName = bankName;
        this.pin = pin;
        this.amount = amount;
    }

    public String getBankName() {
        return bankName;
    }

    public String getPin() {
        return pin;
    }

    public double getAmount() {
        return amount;
    }
}

// Main MovieBookingSystem class
public class MovieBookingSystem {
    private String selectedCity;
    private String selectedMovie;
    private String selectedTheatree;
    private List<String> selectedSeats;
    private List<String> selectedSnacks;
    private Map<String, Integer> snackPrices;  
    private double totalBill;
    private List<Seat> seats;  
    private List<Snack> snacks;
    private String Selectedshow;
    private Scanner scanner;
    private LocalDate selectdate=LocalDate.now();
    private List<PaymentMethod> paymentMethods;

    public MovieBookingSystem() {
        scanner = new Scanner(System.in);
        selectedSeats = new ArrayList<>();
        selectedSnacks = new ArrayList<>();
        snackPrices = new HashMap<>();  
        snackPrices.put("Popcorn", 50);
        snackPrices.put("French Fries", 100);
        snackPrices.put("Coke", 80);
        totalBill = 0;


        seats = new ArrayList<>();  
        snacks = new ArrayList<>();  

        paymentMethods = new ArrayList<>(); 
        initializePaymentMethods(); 
        // Initialize seats
        for (char row = 'A'; row <= 'J'; row++) {
            for (int j = 1; j <= 10; j++) {
                seats.add(new Seat("" + row + j));
            }
        }

        // Initialize snacks using concrete Snack subclasses
        snacks.add(new Popcorn("Popcorn", 50));
        snacks.add(new FrenchFries("French Fries", 100));
        snacks.add(new Coke("Coke", 80));
        
    }
     void movieBooking() {
        System.out.println("\n\t\t\t\t\tWELCOME TO \n");
        System.out.print(cls.orange+cls.blink+"\n\t****     ****     *******     **      **   **   ********       ******       *******       *******     **   **   **   ****     **     ******** ");
        System.out.print("\n\t/**/**   **/**    **/////**   /**     /**  /**  /**/////       /*////**     **/////**     **/////**   /**  **   /**  /**/**   /**    **//////**");
        System.out.print("\n\t/**//** ** /**   **     //**  /**     /**  /**  /**            /*   /**    **     //**   **     //**  /** **    /**  /**//**  /**   **      // ");
        System.out.print("\n\t/** //***  /**  /**      /**  //**    **   /**  /*******       /******    /**      /**  /**      /**  /****     /**  /** //** /**  /**         ");
        System.out.print("\n\t/**  //*   /**  /**      /**   //**  **    /**  /**////        /*//// **  /**      /**  /**      /**  /**/**    /**  /**  //**/**  /**    *****");
        System.out.print("\n\t/**   /    /**  //**     **     //****     /**  /**            /*    /**  //**     **   //**     **   /**//**   /**  /**   //****  //**  ////**");
        System.out.print("\n\t/**        /**   //*******       //**      /**  /********      /*******    //*******     //*******    /** //**  /**  /**    //***   //******** ");
        System.out.print("\n\t//         //     ///////         //       //   ////////       ///////      ///////       ///////     //   //   //   //      ///     ////////  "+cls.reset);
        System.out.print("\n\n");
        String city = selectCity();  
        selectMovie();
        selectTheatre(city);  
        displaySeats();
        selectSeats();
        snackOrPayment();
        generateBill();
        nextMove();
        System.out.println(cls.green+cls.blink+"\t\t\t\t\t Thankyou for Using Our Application!."+cls.reset);
    }
    private void nextMove(){
        System.out.println( cls.yellow+"\n\t\t\t\t\tSelect Next Move : "+cls.reset);
        System.out.println("\n\t\t\t\t\t\t1. Back to Booking.");
        System.out.println("\n\t\t\t\t\t\t2. Exit.\n");
        System.out.print(cls.yellow+"\t\t\t\t\tEnter Your Choice : "+cls.reset);
        String opt=scanner.nextLine();
        boolean valid=true;
        while(valid){
            if(opt.equals("1")){
                movieBooking();
                break;
            }
            else if(opt.equals("2")){
                System.exit(0);
                break;
            }
            else{
                System.out.println("\n\t\t\t\t\t\tInvalid Choice. Please Try Again.");
                System.out.print("\t\t\t\t\t\tEnter Your Choice : ");
            }
        }

    }
    private void generateBill() {
        System.out.println(cls.bwhite+cls.black+"\n\n\n\t\t\t\t\t-------------------- BILL --------------------");
        System.out.println("\n\t\t\t\t\t  City : " + selectedCity);
        System.out.println("\n\t\t\t\t\t  Movie : " + selectedMovie);
        System.out.println("\n\t\t\t\t\t  Theatre : " + selectedTheatree);
        System.out.println("\n\t\t\t\t\t  Date : "+selectdate);
        System.out.println("\n\t\t\t\t\t  Time : "+Selectedshow);
        System.out.println("\n\t\t\t\t\t  Seats : " + String.join(" ", selectedSeats));
        
        if (!selectedSnacks.isEmpty()) {
            System.out.print("\n\t\t\t\t\t  Snacks: ");
            for (String snack : selectedSnacks) {
                System.out.println(" - " + snack);
                System.out.print("\n\t\t\t\t\t\t  ");
            }
        } else {
            System.out.println("\n\t\t\t\t\t  Snacks: None");
        }
    
        System.out.println("\n\t\t\t\t\t  Total Amount: Rs " + totalBill+"/-");
        System.out.println("\n\t\t\t\t\t---------------------------------------------\n\n"+cls.reset);
    }
    
    private void initializePaymentMethods() {
        // Adding three different banks with different PINs and amounts
        paymentMethods.add(new PaymentMethod("State Bank of India", "1234", 5000.00));
        paymentMethods.add(new PaymentMethod("Axis Bank", "5678", 75.00));
        paymentMethods.add(new PaymentMethod("HDFC Bank", "9101", 1000.00));
    }

    public void displayPaymentMethods() {
        int k=1;
        System.out.println(cls.yellow+"\n\n\t\t\t\t\tAvailable Payment Methods:"+cls.reset);
        for (PaymentMethod method : paymentMethods) {
            System.out.println("\n\t\t\t\t\t\t"+k+". " + method.getBankName());
            k++;
        }
    }

    private String selectCity() {
        System.out.println(cls.yellow+"\n\t\t\t\t\tSelect City:"+cls.reset);
        System.out.println("\n\t\t\t\t\t\t1. Hyderabad\n\n\t\t\t\t\t\t2. Kadapa\n\n\t\t\t\t\t\t3. Rajamundry\n\n\t\t\t\t\t\t4. Vishakapatnam\n\n\t\t\t\t\t\t5. Warangal\n\n\t\t\t\t\t\t6. Home\n\n\t\t\t\t\t\t7. Exit\n");
        System.out.print(cls.yellow+"\t\t\t\t\tSelect your Choice: "+cls.reset);
        String cityChoice = scanner.nextLine();  // Read the input as a string
    
        String city = "";
        // Loop until the user enters a valid city choice
        while (true) {
            if (cityChoice.equals("1")) {
                city = "Hyderabad";
                System.out.println(cls.blue+"\n\t\t\t\t\tYou have Selected : "+cls.reset+city);
                break;
            } else if (cityChoice.equals("2")) {
                city = "Kadapa";
                System.out.println(cls.blue+"\n\t\t\t\t\tYou have Selected : "+cls.reset+city);
                break;
            } else if (cityChoice.equals("3")) {
                city = "Rajamundry";
                System.out.println(cls.blue+"\n\t\t\t\t\tYou have Selected : "+cls.reset+city);
                break;
            } else if (cityChoice.equals("4")) {
                city = "Vishakapatnam";
                System.out.println(cls.blue+"\n\t\t\t\t\tYou have Selected : "+cls.reset+city);
                break;
            } else if (cityChoice.equals("5")) {
                city = "Warangal";
                System.out.println(cls.blue+"\n\t\t\t\t\tYou have Selected : "+cls.reset+city);
                break;
            }
            else if(cityChoice.equals("6")){
                movieBooking();
            }
            else if(cityChoice.equals("7")){
                System.out.println(cls.red+"\n\n\t\t\t\t\tExiting the Application..."+cls.reset);
                System.exit(0);
            } else {
                System.out.println(cls.red + "\n\t\t\t\t\tInvalid choice, Please Re-Enter the city....." + cls.reset);
                System.out.print("\n\t\t\t\t\tSelect your City: ");
                cityChoice = scanner.nextLine();  // Re-enter input as a string
            }
        }
        
        selectedCity = city;
        return city;
    }
    
    private void selectMovie() {
        System.out.println("\n\t\t\t\t\tSelect Movie: ");
        boolean validChoice = false;
    
        // Loop until the user selects a valid movie
        while (!validChoice) {
            System.out.println("\n\t\t\t\t\t\t1. OG");
            System.out.println("\n\t\t\t\t\t\t2. Salaar");
            System.out.println("\n\t\t\t\t\t\t3. Devara");
            System.out.println("\n\t\t\t\t\t\t4. Pushpa");
            System.out.println("\n\t\t\t\t\t\t5. Game Changer");
            System.out.println("\n\t\t\t\t\t\t6. Lucky Bhaskar");
            System.out.println("\n\t\t\t\t\t\t7. Home");
            System.out.println("\n\t\t\t\t\t\t8. Exit");
    
            // Get the user's choice for the movie as a string
            System.out.print(cls.yellow+"\n\t\t\t\t\tSelect your choice : "+cls.reset);
            String movieChoice = scanner.nextLine();
    
            // Validate the user's choice
            if (movieChoice.equals("1")) {
                System.out.println(cls.blue+"\n\t\t\t\t\tYou have selected: "+cls.reset+"OG");
                selectedMovie = " OG ";
                validChoice = true;  // Exit loop when valid choice is made
            } else if (movieChoice.equals("2")) {
                System.out.println(cls.blue+"\n\t\t\t\t\tYou have selected: "+cls.reset+"Salaar");
                selectedMovie = " Salaar ";
                validChoice = true;
            } else if (movieChoice.equals("3")) {
                System.out.println(cls.blue+"\n\t\t\t\t\tYou have selected: "+cls.reset+"Devara");
                selectedMovie = " Devara ";
                validChoice = true;
            } else if (movieChoice.equals("4")) {
                System.out.println(cls.blue+"\n\t\t\t\t\tYou have selected: "+cls.reset+"Pushpa");
                selectedMovie = " Pushpa ";
                validChoice = true;
            } else if (movieChoice.equals("5")) {
                System.out.println(cls.blue+"\n\t\t\t\t\tYou have selected: "+cls.reset+"Game Changer");
                selectedMovie = " Game Changer ";
                validChoice = true;
            } else if (movieChoice.equals("6")) {
                System.out.println(cls.blue+"\n\t\t\t\t\tYou have selected: "+cls.reset+"Lucky Bhaskar");
                selectedMovie = " Lucky Bhaskar ";
                validChoice = true;
            }
            else if (movieChoice.equals("7")) {
                movieBooking();
            }
            else if(movieChoice.equals("8"))
            {
                System.out.println(cls.red+"\n\t\t\t\t\tExiting the application..."+cls.reset);
                System.exit(0);
            } else {
                System.out.println(cls.red + "\n\t\t\t\t\tInvalid Movie, Please Re-Enter Again..." + cls.reset);
            }
        }
    }

    private double ticketPrice = 0.0;
    
    private void selectTheatre(String city) {
        List<Theatre> theatres = new ArrayList<>();
        boolean validChoice = false;
        int theatreChoice = -1;
        int showtimeChoice = -1;
    
        // Create theatres based on selected city
        switch (city) {
            case "Hyderabad":
                theatres.add(new Theatre("PVR Cinemas"));
                theatres.add(new Theatre("Cinepolis"));
                theatres.add(new Theatre("Inox"));
                theatres.get(0).addShowtime("10:00 AM");
                theatres.get(0).addShowtime("01:00 PM");
                theatres.get(0).addShowtime("04:00 PM");
                theatres.get(1).addShowtime("11:30 AM");
                theatres.get(1).addShowtime("02:30 PM");
                theatres.get(1).addShowtime("05:30 PM");
                theatres.get(2).addShowtime("12:00 PM");
                theatres.get(2).addShowtime("03:00 PM");
                theatres.get(2).addShowtime("06:00 PM");
                break;
    
            case "Kadapa":
                theatres.add(new Theatre("MYTHRI Cinemas"));
                theatres.add(new Theatre("Venkateshwara Cinemas"));
                theatres.add(new Theatre("Surya Mahal"));
                theatres.get(0).addShowtime("09:30 AM");
                theatres.get(0).addShowtime("01:30 PM");
                theatres.get(0).addShowtime("05:30 PM");
                theatres.get(1).addShowtime("10:30 AM");
                theatres.get(1).addShowtime("02:30 PM");
                theatres.get(1).addShowtime("06:30 PM");
                theatres.get(2).addShowtime("09:30 AM");
                theatres.get(2).addShowtime("01:30 PM");
                theatres.get(2).addShowtime("06:30 PM");
                break;
    
            case "Vishakapatnam":
                theatres.add(new Theatre("MYTHRI Cinemas"));
                theatres.add(new Theatre("Venkateshwara Cinemas"));
                theatres.add(new Theatre("Inox"));
                theatres.get(0).addShowtime("10:00 AM");
                theatres.get(0).addShowtime("01:00 PM");
                theatres.get(0).addShowtime("04:00 PM");
                theatres.get(1).addShowtime("11:30 AM");
                theatres.get(1).addShowtime("02:30 PM");
                theatres.get(1).addShowtime("05:30 PM");
                theatres.get(2).addShowtime("12:00 PM");
                theatres.get(2).addShowtime("03:00 PM");
                theatres.get(2).addShowtime("06:00 PM");
                break;
    
            case "Warangal":
                theatres.add(new Theatre("Warangal Cinemas"));
                theatres.add(new Theatre("Nirmal Theatre"));
                theatres.get(0).addShowtime("08:30 AM");
                theatres.get(0).addShowtime("12:30 PM");
                theatres.get(0).addShowtime("04:30 PM");
                theatres.get(1).addShowtime("09:00 AM");
                theatres.get(1).addShowtime("01:00 PM");
                theatres.get(1).addShowtime("05:00 PM");
                break;
    
            case "Rajamundry":
                theatres.add(new Theatre("SVC Cinemas"));
                theatres.add(new Theatre("Apsara Theatre"));
                theatres.add(new Theatre("Anu Sri Theatre"));
                theatres.get(0).addShowtime("08:30 AM");
                theatres.get(0).addShowtime("12:30 PM");
                theatres.get(0).addShowtime("04:30 PM");
                theatres.get(1).addShowtime("09:00 AM");
                theatres.get(1).addShowtime("01:00 PM");
                theatres.get(1).addShowtime("05:00 PM");
                theatres.get(2).addShowtime("12:00 PM");
                theatres.get(2).addShowtime("03:00 PM");
                theatres.get(2).addShowtime("06:00 PM");
                break;
    
            default:
                System.out.println(cls.red + "\n\n\t\t\t\t\tInvalid city selection. Please select a valid city." + cls.reset);
                return; // Stop execution if city is invalid
        }
    
        // Loop until a valid theatre is selected
        while (!validChoice) {
            // Display list of theatres with ticket prices
            System.out.println(cls.yellow+"\n\n\t\t\t\t\tAvailable Theatres: "+cls.reset);
            for (int i = 0; i < theatres.size(); i++) {
                String ticketPriceString = "";
                switch (i + 1) {  // Theatre options are 1, 2, 3... for easy display
                    case 1:
                        ticketPriceString = "RS 200/-";
                        break;
                    case 2:
                        ticketPriceString = "Rs 250/-";
                        break;
                    case 3:
                        ticketPriceString = "RS 300/-";
                        break;
                    default:
                        ticketPriceString = "Unknown";
                }
                System.out.println("\n\t\t\t\t\t\t" + (i + 1) + ". " + theatres.get(i).getName() + " - " + ticketPriceString);
            }
    
            System.out.print(cls.yellow + "\n\t\t\t\t\tSelect a theatre (1-" + theatres.size() + "): " + cls.reset);
    
            // Check if the user input is a valid number
            String input = scanner.nextLine();
            if (isValidInteger(input)) {
                theatreChoice = Integer.parseInt(input);
                // Check if the theatreChoice is valid
                if (theatreChoice >= 1 && theatreChoice <= theatres.size()) {
                    selectedTheatree = theatres.get(theatreChoice - 1).getName();
                    ticketPrice = (theatreChoice == 1) ? 200 : (theatreChoice == 2) ? 250 : 300; // Set ticket price based on theatre selection
                    validChoice = true;
                } else {
                    System.out.println(cls.red + "\n\t\t\t\t\tInvalid theatre choice, please try again." + cls.reset);
                }
            } else {
                System.out.println(cls.red + "\n\t\t\t\t\tInvalid input! Please enter a valid number." + cls.reset);
            }
        }
        System.out.println(cls.blue + "\n\t\t\t\t\tYou have selected: "+cls.reset + selectedTheatree +cls.blue+ " - Ticket Price: "+ cls.reset+"Rs " + ticketPrice+"/-" );
        // Display selected date and theatre
        String selectedDate = selectDate();  // Get selected date and day
        System.out.println(cls.blue + "\n\n\t\t\t\t\tYou have selected: "+ cls.reset + selectedDate + "\n");
        Theatre selectedTheatre = theatres.get(theatreChoice - 1);
        selectedTheatre.displayShowtimes();  // Display available showtimes for the selected theatre
    
        // Loop until a valid showtime is selected
        boolean validShowtimeChoice = false;
        while (!validShowtimeChoice) {
            System.out.print(cls.yellow+"\n\n\t\t\t\t\tEnter your showtime choice (1-" + theatres.get(theatreChoice - 1).getShowtimes().size() + "): "+cls.reset);
    
            // Check if the user input is a valid number
            String input = scanner.nextLine();
            if (isValidInteger(input)) {
                showtimeChoice = Integer.parseInt(input);
                // Validate showtime choice
                if (showtimeChoice >= 1 && showtimeChoice <= theatres.get(theatreChoice - 1).getShowtimes().size()) {
                    Selectedshow=theatres.get(theatreChoice - 1).getShowtimes().get(showtimeChoice - 1);
                    System.out.println(cls.blue + "\n\t\t\t\t\tYou have selected: "+cls.reset +
                            Selectedshow );
                    validShowtimeChoice = true;
                } else {
                    System.out.println("\n\t\t\t\t\tInvalid showtime choice, Please Re-Enter...");
                }
            } else {
                System.out.println(cls.red + "\n\t\t\t\t\tInvalid input! Please enter a valid number." + cls.reset);
            }
        }
    }
    
    // Utility method to check if a string is a valid integer
    private boolean isValidInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    // Method to select the date
    private String selectDate() {
        // Get today's date
        LocalDate currentDate = LocalDate.now();
        LocalDate nextDay = currentDate.plusDays(1);
        LocalDate dayAfterNext = currentDate.plusDays(2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Display the present date, next day, and day after next, along with the day of the week
        System.out.println(cls.yellow+"\n\t\t\t\t\tAvailable Dates: "+cls.reset);
        System.out.println("\n\t\t\t\t\t\t1. " + currentDate.format(formatter) + " - " + currentDate.getDayOfWeek());
        System.out.println("\n\t\t\t\t\t\t2. " + nextDay.format(formatter) + " - " + nextDay.getDayOfWeek());
        System.out.println("\n\t\t\t\t\t\t3. " + dayAfterNext.format(formatter) + " - " + dayAfterNext.getDayOfWeek());
        System.out.print(cls.yellow+"\n\t\t\t\t\tSelect Date (1-3): "+cls.reset);

        String dateChoice = scanner.next();
        scanner.nextLine(); // Consume newline

        LocalDate selectedDate = currentDate; // Default to today
        switch (dateChoice) {
            case "1":
                selectedDate = currentDate;
                selectedDate=currentDate;
                break;
            case "2":
                selectedDate = nextDay;
                selectdate=nextDay;
                break;
            case "3":
                selectedDate = dayAfterNext;
                selectdate=dayAfterNext;
                break;
            default:
                System.out.println(cls.red+"\n\t\t\t\t\tInvalid choice, Enter again."+cls.reset);
                return selectDate();  // Recursively call selectDate if input is invalid
        }

        return selectedDate.format(formatter) + " - " + selectedDate.getDayOfWeek();
    }

    // Helper method to get the ticket price based on theatre choice
    private double getTicketPrice(int theatreChoice) {
        switch (theatreChoice) {
            case 1:
                return 200;
            case 2:
                return 250;
            case 3:
                return 300;
            default:
                return 0.0;  // Default price if invalid choice
        }
    }



// Method to display the seating arrangement
    private void displaySeats() {
        System.out.println(cls.yellow+"\n\n\t\t\t\t\tSeating Arrangement: "+cls.reset);
        System.out.print("\n\t\t\t\t\t\t");
    
        // Iterate through all seats
        for (Seat seat : seats) {
            // Display 'X' for booked seats and 'O' for available seats with tab spaces
            System.out.print((seat.isBooked() ? "X" : "O") + " ");
    
            // Format for printing to break line every 10 seats
            if (seat.getSeatNumber().endsWith("10")) {
                System.out.println(); // New line after every 10 seats for proper formatting
                System.out.print("\n\t\t\t\t\t\t");
            }
        }
    
        System.out.println(); // Extra line for formatting after seat display
    }

    private void selectSeats() {
        System.out.print(cls.yellow+"\n\t\t\t\t\tEnter seat numbers (e.g., A1 B2 C3): "+cls.reset);
        String seatInput = scanner.nextLine();
        System.out.println();
        String[] seatNumbers = seatInput.split("\\s+");
    
        int seatCount = 0;
    
        // Loop through the selected seats and book them
        for (String seatNumber : seatNumbers) {
            boolean seatFound = false;
            for (Seat seat : seats) {
                if (seat.getSeatNumber().equals(seatNumber)) {
                    seatFound = true;
    
                    if (!seat.isBooked()) {
                        seat.book();  // Mark the seat as booked
                        selectedSeats.add(seatNumber);
                        seatCount++;
                    } else {
                        System.out.println(cls.red+"\n\t\t\t\t\tSeat "+cls.reset + seatNumber + cls.red+" is already booked."+cls.reset);
                    }
                    break;
                }
            }
    
            // If the seat number doesn't exist
            if (!seatFound) {
                System.out.println(cls.red+"\n\t\t\t\t\tInvalid seat number: "+cls.reset + seatNumber);
            }
        }
        boolean validSeat=false;
        while(!validSeat)
        {
            if (seatCount > 0) {
            totalBill = ticketPrice * seatCount;
            System.out.println(cls.blue+"\n\t\t\t\t\t"+seatCount+" Seats booked. Total bill: "+cls.reset +"Rs "+ totalBill+"/-");
            validSeat=true;
            // Display updated seating arrangement after booking
            displaySeats();
            } 
            else {
                System.out.println(cls.blue+"\n\t\t\t\t\tNo valid seats selected.\n"+cls.reset);
                System.out.println(cls.yellow+"\t\t\t\t\tSelect option : "+cls.reset);
                System.out.println("\n\t\t\t\t\t\t1. Select Again Seats ");
                System.out.println("\n\t\t\t\t\t\t2. Home");
                System.out.println("\n\t\t\t\t\t\t3. Exit \n");
                System.out.print(cls.yellow+"\t\t\t\t\tEnter your choice : "+cls.reset);
                String opt=scanner.nextLine();
                if(isValidInteger(opt))
                {
                    int opt1=Integer.parseInt(opt);
                    if(opt1==1)
                    {
                        // Display updated seating arrangement after booking
                        validSeat=true;
                        displaySeats();
                        selectSeats();
                    }
                    else if(opt1==2)
                    {
                        validSeat=true;
                        movieBooking();
                    }
                    else if(opt1==3)
                    {
                        validSeat=true;
                        System.exit(0);
                    }
                    else
                    {
                        System.out.println(cls.red+"\n\t\t\t\t\tInvalid option. Please select a valid"+cls.reset);
                    }
                }
                else
                {
                    System.out.println(cls.red+"\n\t\t\t\t\tInvalid option. Please enter a valid option."+cls.reset);
                }
            }
        }

    }

    private void snackOrPayment() {
        System.out.println(cls.yellow+"\t\t\t\t\tChoose your Next Move : "+cls.reset);
        System.out.println("\n\t\t\t\t\t\t1. Have a Snack\n\n\t\t\t\t\t\t2. Continue to Payment");
        System.out.print("\n\t\t\t\t\tChoose an option: ");
        String snackOption = scanner.next();
        scanner.nextLine(); // Consume newline

        if (isValidInteger(snackOption)) {
            int opt1=Integer.parseInt(snackOption);
            if(opt1 == 1){
                selectSnacks();
            }
            else if(opt1==2)
            {
                payment();
            }
        } 
        else {
            System.out.println(cls.red+"\n\t\t\t\t\tInvalid Input, Re-Enter again...\n"+cls.reset);
            snackOrPayment();
        }
    }
    private double selectedsnackprice=0.0;
    private void selectSnacks() {
        System.out.println(cls.yellow+"\n\t\t\t\t\tSelect Snacks :"+cls.reset);
        System.out.println("\n\t\t\t\t\t\t1. Popcorn - Rs 50/-");
        System.out.println("\n\t\t\t\t\t\t2. French Fries - Rs 100/-");
        System.out.println("\n\t\t\t\t\t\t3. Coke - Rs 80/-");
        System.out.println("\n\t\t\t\t\t\t4. For Payment");

        boolean selectingSnacks = true;
        while (selectingSnacks) {
            System.out.print(cls.yellow+"\n\n\t\t\t\t\tEnter your choice: "+cls.reset);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("\n\t\t\t\t\tEnter quantity for Popcorn: ");
                    int popcornQuantity = Integer.parseInt(scanner.nextLine());
                    selectedSnacks.add("Popcorn x" + popcornQuantity);
                    selectedsnackprice  = 50.0;
                    totalBill += 50.0 * popcornQuantity;
                    System.out.println("\n\t\t\t\t\t"+popcornQuantity + " Popcorn added.n");
                    break;
                case "2":
                    System.out.print("\n\t\t\t\t\tEnter quantity for French Fries: ");
                    int friesQuantity = Integer.parseInt(scanner.nextLine());
                    selectedSnacks.add("French Fries x" + friesQuantity);
                    selectedsnackprice  = 100.0;
                    totalBill += 100 * friesQuantity;
                    System.out.println("\n\t\t\t\t\t"+friesQuantity + " French Fries added.\n");
                    break;
                case "3":
                    System.out.print("\n\t\t\t\t\tEnter quantity for Coke: ");
                    int cokeQuantity = Integer.parseInt(scanner.nextLine());
                    selectedSnacks.add("Coke x" + cokeQuantity);
                    selectedsnackprice  = 80.0;
                    totalBill += 80 * cokeQuantity;
                    System.out.println("\n\t\t\t\t\t"+cokeQuantity + " Coke added.\n");
                    break;
                case "4":
                    selectingSnacks = false; 
                    payment();
                    break;
                default:
                    System.out.println(cls.red+"\n\t\t\t\t\tInvalid choice. Please try again."+cls.reset);
            }
        }
    }

    private void promptForNextAction() {
        System.out.println(cls.yellow+"\t\t\t\t\tChoose Your Next Move : "+cls.reset);
        System.out.println("\n\n\t\t\t\t\t1. Continue to Payment");
        System.out.println("\n\n\t\t\t\t\t2. Exit");
        System.out.print("\n\n\t\t\t\t\tEnter your Choice : ");
        int snackOption = Integer.parseInt(scanner.nextLine());
        if (snackOption == 1) {
            payment(); // Proceed to payment
        } else if (snackOption == 2) {
            System.out.println(cls.green+cls.blink+"\t\t\t\t\tThankyou for Using Our Application!.."+cls.reset);
            System.exit(0); // Allow adding another snack
        } else {
            System.out.println(cls.red+"\n\n\t\t\t\t\tInvalid choice. Please try again."+cls.reset);
            promptForNextAction(); 
        }
    }

    private void payment() {
        displayPaymentMethods(); // Display available payment methods

        System.out.print(cls.yellow+"\n\t\t\t\t\tSelect a payment method (1-" + paymentMethods.size() + "): "+cls.reset);
        String k = scanner.nextLine();
        int paymentChoice=0;
        if(isValidInteger(k))
        {
            paymentChoice = Integer.parseInt(k);
            if (paymentChoice < 1 || paymentChoice > paymentMethods.size()) {
                System.out.println(cls.red+"\n\t\t\t\t\tInvalid selection. Please try again."+cls.reset);
                payment();
                return; // Exit the method if the selection is invalid
            }
        }
        else{
            System.out.println(cls.red+"\n\t\t\t\t\tInvalid choice. Please try again.\n"+cls.reset);
            payment();
            return;
        }
        PaymentMethod selectedMethod = paymentMethods.get(paymentChoice - 1); // Get the selected payment method
        System.out.print("\n\t\t\t\t\tEnter your PIN for " + selectedMethod.getBankName() + ": ");
        String enteredPin = scanner.nextLine();

        if (enteredPin.equals(selectedMethod.getPin())) {
            if(totalBill<=selectedMethod.getAmount()){
                System.out.println("\n\t\t\t\t\tPayment of Rs " + totalBill + " successful using " + selectedMethod.getBankName() + ".");
                // Proceed with further actions after successful payment
            }
            else
            {
                System.out.println(cls.red+"\n\n\t\t\t\t\t   Insufficient Balance, Retry...."+cls.blue+"\n\n\t\t\t\t\tYou have Rs "+selectedMethod.getAmount()+"/- in your Account..."+cls.reset);
                payment();
            }
        } else {
            System.out.println(cls.red+"\n\t\t\t\t\tIncorrect PIN. Payment failed."+cls.reset);
            payment();
        }
    }


    public static void main(String[] args) {
        System.out.println("\n\n\n");
        System.out.print(cls.cyan+cls.blink+"\n\t**   **********   **                  ********   **      **     *******     **       **       **********   **   ****     ****   ********");
        System.out.print("\n\t/**  /////**///   //*                 **//////   /**     /**    **/////**   /**      /**      /////**///   /**  /**/**   **/**  /**/////"); 
        System.out.print("\n\t/**      /**       /     ******      /**         /**     /**   **     //**  /**   *  /**          /**      /**  /**//** ** /**  /**     ");
        System.out.print("\n\t/**      /**            **////       /*********  /**********  /**      /**  /**  *** /**          /**      /**  /** //***  /**  /*******");
        System.out.print("\n\t/**      /**           //*****       ////////**  /**//////**  /**      /**  /** **/**/**          /**      /**  /**  //*   /**  /**//// ");
        System.out.print("\n\t/**      /**            /////**             /**  /**     /**  //**     **   /**** //****          /**      /**  /**   /    /**  /**      ");
        System.out.print("\n\t/**      /**            ******        ********   /**     /**   //*******    /**/   ///**          /**      /**  /**        /**  /********");
        System.out.print("\n\t//       //            //////        ////////    //      //     ///////     //       //           //       //   //         //   //////// "+cls.reset);
        System.out.print("\n\n\n");
        
        Verification verification = new Verification();
        verification.validation();
        MovieBookingSystem system = new MovieBookingSystem();
        system.movieBooking();
    }
}
