public class Main {
	public int addTwoNumbers(int a, int b) {

		return a + b;
	}

	public int multiplyTwoNumbers(int a, int b) {

		return a * b;
	}

	public float divideTwoNumbers(int a, int b) {

		return a/b;
	}

	public int substractTwoNumbers(int a, int b) {

		return a - b;
	}

	public boolean isNumberEven(int a){

		if(a%2 == 0){

			return true;

		}else{

			return false;

		}
	}

	public int calculateFirstRightDigit(int a){
		
		if(a<0){

			a = -a;
		
			return a%10;

		}else{

			return a%10;


		}

	}

	public float celciusToFahrenheit(float a){

		return a * 9/5 + 32;
	}

	public float areaOfATriangle(float height, float base){

		return height*base/2;


	}

	public boolean isLeapYear(int year){

		if(year% 4 == 0){

			return true;

		}else if(year%100 == 0 && year%400 == 0){

			return true;

		}else{

			return false;

		}
	}

    public boolean isPrime(int number) {
		

		int contador = 0;

		for(int i = 1; i <= number; i++){

			if(number%i == 0 ){

				contador = contador + 1;

			}


		}

			if(contador == 2){

				return true; 

			}else{

				return false;


			}

		

    }

    public int calculateFactorial(int number){

		int m = 1;

		for(int i = 1; i <= number; i++){

			m = i * m;



		}

		return m;

    }

    public int calculateLastNFibonnacci(int n){


		int x = 0;
		int y = 1;
		int m = 0;

		for(int i = 1; i < n; i++ ){

			
			m = x;
			x = y;
			y = m + y;
			
			


			
			

		}

		return y;

    }

    public int getNumberOfDigits(int number){


		int contador = 0;

		while(number > 0){

			number = Math.floorDiv(number, 10);

			contador++;
		}

		return contador;
    }



    public int rotateNumber(int number){


		int x = 0;
		int y = 0;


		while(number>0){

			y = number % 10;
			x = x * 10 + y;
			number = Math.floorDiv(number, 10);


		}

		return x;

		

    }

    public int sumOffirstNNumbersMultiplesOfFiveOrThree(int N){

		int contador = 0;

		for(int i = N; i>0; i--){


			if(i % 5 == 0 || i % 3 == 0 ){


				contador = i + contador;


			}


		}

		return contador;
		
    }

    }
