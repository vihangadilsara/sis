import java.util.*;
class SIS{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("------------------------------------------");
		System.out.println("| \t SALARY INFORMATION SYSTEM \t |");
		System.out.println("------------------------------------------");
		
		System.out.println('\n');
		
		System.out.println("\t [1] Calculate Income Tax ");
		System.out.println("\t [2] Calculate Annual Bonus ");
		System.out.println("\t [3] Calculate Loan Amount ");
		
		System.out.println('\n');
		
		System.out.print("Enter an option to continue > ");
		int option  = input.nextInt();
		
		switch(option){
			case 1:{
				
				System.out.println("----------------------------------");
				System.out.println("| \t Calculate Income Tax \t |");
				System.out.println("----------------------------------");
				
				System.out.println('\n');
				
				System.out.print("Input Employee name : ");
				String employeeName = input.next();
				
				System.out.print("Input Employee salary : ");	
				int salary = input.nextInt();
				
				double group_1 = (141667 - 100000) * 0.06;
				double group_2 = (183333 - 141667) * 0.12;
				double group_3 = (225000 - 183333) * 0.18;
				double group_4 = (266667 - 225000) * 0.24;
				double group_5 = (308333 - 266667) * 0.36;
				
				if(salary < 100000){
					System.out.println("Tax Free");
				}else if(salary <= 141667){
					double tax = (salary - (100000)) * 0.06;
					
					System.out.println("\nYou have to pay Income tax per month : " +(int) tax);
				}else if(salary <= 183333){ // salary  = 183 334/=
					double tax = (salary - 141667) * 0.12;
					double totalTax = tax + group_1;
					
					System.out.println("\nYou have to pay Income tax per month : " +(int) totalTax);
				}else if (salary <= 225000){
					double tax = (salary - 183333) * 0.18;
					double totalTax = tax + group_1 + group_2;
					
					System.out.println("\nYou have to pay Income tax per month : " +(int) totalTax);
				}else if (salary <= 266667){
					double tax = (salary - 225000) * 0.24;
					double totalTax = tax + group_1 + group_2 + group_3;
					
					System.out.println("\nYou have to pay Income tax per month : " +(int) totalTax);
				}else if (salary <= 308333){
					double tax = (salary - 266667) * 0.3;
					double totalTax = tax + group_1 + group_2 + group_3 + group_4;
					
					System.out.println("\nYou have to pay Income tax per month : " +(int) totalTax);
				} else if(salary > 308333){
					double tax = (salary - 308333) * 0.36;
					double totalTax = tax + group_1 + group_2 + group_3 + group_4 + group_5;
					
					System.out.println("You have to pay Income tax per month : " +(int) totalTax);
				}
				
				break;
			}
			case 2:{
				System.out.println("------------------------------------------"); 
				System.out.println("| \t Calculate Annual Bonus \t |"); 
				System.out.println("------------------------------------------");
				
				System.out.println('\n');
				
				System.out.print("Input Employee name : ");
				String employeeName = input.next();
				
				System.out.print("Input Employee salary : ");	
				int salary = input.nextInt();
				
				if(salary < 100000){
					System.out.println("Annual Bonus 5000/=");
				}else if(salary < 200000){
					double annualBonus = salary * 0.1;
					System.out.println("\nAnnual Bonus " + annualBonus);
				}else if(salary < 300000){
					double annualBonus = salary * 0.15;
					System.out.println("\nAnnual Bonus " + annualBonus);
				}else if(salary < 400000){
					double annualBonus = salary * 0.2;
					System.out.println("\nAnnual Bonus " + annualBonus);
				}else if(salary > 400000){
					double annualBonus = salary * 0.35;
					System.out.println("\nAnnual Bonus " + annualBonus);
				}
				
				break;
			}
			case 3:{
				
				System.out.println("----------------------------------");
				System.out.println("| \t Calculate Loan Amount \t |");
				System.out.println("----------------------------------");
				
				System.out.println('\n');
				
				System.out.print("Input Employee name : ");
				String employeeName = input.next();
				
				System.out.print("Input Employee salary : ");	
				int salary = input.nextInt();
				
				if(salary <= 50000){
					System.out.println("\tYou can not get a loan because your salary lessthan Rs50 000....");
				}else{
					System.out.print("Input number of years : ");	
					int years = input.nextInt();
					
					System.out.println('\n');
					
					if(years > 5){
						System.exit(0);
					}else{
						
						double rate, loanAmount, monthlyInstallment;
						int noMonth = years * 12;
						rate = 0.15;
						monthlyInstallment = salary * 0.6;
						
						double x = rate / 12;
						double y = 1 + x;
						double z = Math.pow(y,noMonth);
						
						double a = 1 / z;
						
						double c = 1 - a;
						
						loanAmount = monthlyInstallment * c / x ;
						loanAmount =((int)loanAmount / 1000) * 1000;
						
						System.out.println("You can get Loan Amount = " +loanAmount);
						
					}
				}
				
				break;
			}
			default:{
				System.out.println("Wrong Option..");
				System.exit(0);
			}
		}
	}
}
