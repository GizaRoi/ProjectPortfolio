/***************************************************************************
This is to certify that this project is my own work, based on my personal efforts
in studying and applying the concepts learned. I have constructed the
functions and their respective algorithms and corresponding code by myself.
The program was run, tested, and debugged by my own efforts. I further
certify that I have not copied in part or whole or otherwise plagiarized the
work of other students and/or persons.

												Roimarc F. Bilbao, 12203394


Description: AllowIt is a budgeting program that takes the allowance,
			 budget plan, and expenses of the user, and evaluates these
			 values to guide the user towards financial stability.
Programmed by: Roimarc Bilbao | S20A
Last modified: November 21, 2022
Version: 2.2.3
Acknowledgements: patorjk Text to ASCII Art Generator (https://patorjk.com/software/taag/)
****************************************************************************/

#include <stdio.h>
/* This function displays the title at the start of the program.
*/
void displayTitle ()
{
	printf("\n");
	printf("%s\n", "  ___  _ _             _____ _ ");
	printf("%s\n", " / _ \\| | |           |_   _| |  ");
	printf("%s\n", "/ /_\\ \\ | | _____      _| | | |_");
	printf("%s\n", "|  _  | | |/ _ \\ \\ /\\ / / | | __|");
	printf("%s\n", "| | | | | | (_) \\ V  V /| |_| |_ ");
	printf("%s\n", "\\_| |_/_|_|\\___/ \\_/\\_/\\___/\\___|");
}

/* This function displays a line of dashes to better organize outputs from the program.
*/
void displayDivider ()
{
	printf("\n%s%s%s%s\n","----------------", "----------------", "----------------", "----------------");
}


/* This function gets the allowance from the input of the user which will be used by the program.
   Precondition: *fAllowance is a non-negative value.
   @param *fAllowance is the monthly allowance of the user.
*/
void getAllowance (float *fAllowance)
{
	float fNewAllowance;
	do {
	printf("\n[0] BACK TO MAIN MENU\n");
	printf("Previously Entered Allowance: %.2f\n", *fAllowance);
	printf("Monthly Allowance:\n");
	printf("How much money do you acquire in a month?  ");
	scanf("%f", &fNewAllowance);
	if (fNewAllowance < 13000 && fNewAllowance > 0)
		printf("\n!MINIMUM ALLOWANCE MUST BE 13000!\n");
	} while (fNewAllowance < 13000 && fNewAllowance > 0);
	if (fNewAllowance != 0)
	{
		int nAnswer;
		printf("\n\t  [1] YES   [0] BACK TO MAIN MENU\n");
		printf("Do you confirm your allowance of %.2f per month? ", fNewAllowance);
		scanf("%d", &nAnswer);
		if (nAnswer == 1)
			*fAllowance = fNewAllowance;
		else
			*fAllowance = *fAllowance;
	}
}

/* This function allocates the budget for each expense category that will be used for
   assessing the monthly expenses of the user.
   Precondition: *fAllowance, *fTransB, *fHealthB, *fLeisureB, and *fEducB are non-negative values,
   while *fFoodB must be at least 300, and *fHouseB must be at least 4000.
   @param *fAllowance is the monthly allowance of the user.
   @param *fFoodB is the daily allocated budget for Food and Drinks.
   @param *fTransB is the monthly allocated budget for Transportation services.
   @param *fHealthB is the monthly allocated budget for Healthcare Products and Services.
   @param *fHouseB is the monthly allocated budget for Housing and Utilities.
   @param *fLeisureB is the monthly allocated budget for Leisure Activities.
   @param *fEducB is the monthly allocated budget for Educational Purposes.
*/
void allocBudget (float *fAllowance, float *fFoodB, float *fTransB,
			 float *fHealthB, float *fHouseB, float *fLeisureB, float *fEducB)
{
	*fFoodB = 300, *fHouseB = 4000;
	int nInput;
	char cOkay;
	displayDivider();
	do {
	printf("\nB U D G E T   C A T E G O R I E S\n");
	printf("\n[1] Food and Drinks\n");
	printf("[2] Transportation\n");
	printf("[3] Healthcare\n");
	printf("[4] Housing and Utilities\n");
	printf("[5] Leisure\n");
	printf("[6] School\n");
	printf("[0] Finish Budgeting\n");
	printf("Choose an Budget Category:  ");
	scanf("%d", &nInput);
	
	switch (nInput)
	{
		case 1:
			{
			do {
				printf("\n[0] GO BACK");
				printf("\nAllocate Budget for Food and Drinks:  ");
				scanf("%f", fFoodB);
				if (*fFoodB < 300 && *fFoodB != 0)
				printf("\n!MINIMUM BUDGET FOR FOOD AND DRINKS IS 300!\n");
			} while (*fFoodB < 300 && *fFoodB != 0);
			}
		break;
		case 2:
			{
			do{
			printf("\n[0] GO BACK");
			printf("\nAllocate Budget for Transportation:  ");
			scanf("%f", fTransB);
			if (*fTransB < 0)
				printf("Invalid Input.\n");
			} while (*fTransB < 0);
			}
		break;
		case 3:
			{
			do{
			printf("\n[0] GO BACK");
			printf("\nAllocate Budget for Healthcare:  ");
			scanf("%f", fHealthB);
			if (*fHealthB < 0)
				printf("Invalid Input.\n");
			} while (*fHealthB < 0);
			}
		break;
		case 4:
			{	
			do {
				printf("\n[0] GO BACK");
				printf("\nAllocate Budget for Housing and Utilities:  ");
				scanf("%f", fHouseB);
				if (*fHouseB < 4000 && *fHouseB != 0)
				printf("\n!MINIMUM BUDGET FOR HOUSING AND UTILITIES IS 4000!\n");
			} while (*fHouseB < 4000 && *fHouseB != 0);
			}
		break;
		case 5:
			{
			do{
			printf("\n[0] GO BACK");
			printf("\nAllocate Budget for Leisure Activities:  ");
			scanf("%f", fLeisureB);
			if (*fLeisureB < 0)
				printf("Invalid Input.\n");
			} while (*fLeisureB < 0);
			}
		break;
		case 6:
			{
			do{
			printf("\n[0] GO BACK");
			printf("\nAllocate Budget for Education:  ");
			scanf("%f", fEducB);
			if (*fEducB < 0)
				printf("Invalid Input.\n");
			} while (*fEducB < 0);
			}
		break;
		case 0:
			{
			int nFinish;
			printf("\n [1] YES   [0] BACK TO MAIN MENU\n");
			printf("Do you confirm your budget allocation? ");
			scanf("%d", &nFinish);
			if (nFinish == 1)
			{
				printf("\nBUDGET BREAKDOWN: \n");
				float fTotalExpenditure = (*fFoodB * 30) + *fTransB + *fHealthB + *fHouseB + *fLeisureB + *fEducB;
				float fRemainingB = 0; fRemainingB = *fAllowance - fTotalExpenditure;

				displayDivider();
	
				printf("Food and Drinks x 30:    %10.2f\n", *fFoodB * 30);
				printf("Transportation:          %10.2f\n", *fTransB);
				printf("Healthcare:              %10.2f\n", *fHealthB);
				printf("Housing and Utilities:   %10.2f\n", *fHouseB);
				printf("Leisure Activities:      %10.2f\n", *fLeisureB);
				printf("Education:               %10.2f\n", *fEducB);

				displayDivider();

				printf("Allowance:               %10.2f\n", *fAllowance);
				printf("Total Expenditure:       %10.2f\n", fTotalExpenditure);
				printf("Remaining Balance:       %10.2f", fRemainingB);

				if (fRemainingB < 0)
				{
					printf("\n!TOTAL BUDGET ALLOCATION MUST NOT BE GREATER THAN ALLOWANCE!\n\n");
					*fFoodB = 300, *fTransB = 0, *fHealthB = 0, *fHouseB = 4000; *fLeisureB = 0, *fEducB = 0;
					printf("Press any key to continue. ");
					scanf(" %c", &cOkay);
				}
			}
			else
			{
			*fFoodB = 300, *fTransB = 0, *fHealthB = 0, *fHouseB = 4000; *fLeisureB = 0, *fEducB = 0;	
			} 
			}
		break;
		default:
			printf("\nInvalid Input!\n");
	}
	}while (nInput > 0);
	
	*fFoodB = *fFoodB, *fTransB = *fTransB, *fHealthB = *fHealthB, *fHouseB = *fHouseB, *fLeisureB = *fLeisureB, *fEducB = *fEducB;
}

/* This function adds expenses for each of the 6 expense categories and displays the user's summary of expenses for each category
   along with the total expenses and remaining balance.
   Precondition: *fAllowance, *fExpenses, *fFood, *fTrans, *fHealthB, *fHouse, *fLeisure, and *fEduc 
   are non-negative values.
   @param *fAllowance is the monthly allowance of the user.
   @param *fExpenses is the total expenses for the 6 expense categories.
   @param *fFood is the expense for Food and Drinks.
   @param *fTrans is the expense for Transportation Services.
   @param *fHealth is the expense for Healthcare Products and Services.
   @param *fHouse is the expense for Housing and Utilities.
   @param *fLeisure is the expense for Leisure Activities.
   @param *fEduc is the expense for Educational Purposes.
*/
void allocExpense (float *fAllowance, float *fExpenses, float *fFood, float *fTrans,
			 float *fHealth, float *fHouse, float *fLeisure, float *fEduc)
{
	int nInput;
	char cOkay;
	float fAddFood, fAddTrans, fAddHealth, fAddHouse, fAddLeisure, fAddEduc;
	
	do {
	displayDivider();
	printf("\nE X P E N S E   C A T E G O R I E S\n");
	printf("\n[1] Food and Drinks\n");
	printf("[2] Transportation\n");
	printf("[3] Healthcare\n");
	printf("[4] Housing and Utilities\n");
	printf("[5] Leisure\n");
	printf("[6] School\n");
	printf("[0] Back\n");
	printf("Choose an Expense Category:  ");
	scanf("%d", &nInput);
	
	switch (nInput)
	{
		case 0:
			{
				printf("\nEXPENSES SUMMARY:");
			}
		break;
		case 1:
			{
			do {
			printf("\nAdd Expenses for Food and Drinks: ");
			scanf("%f", &fAddFood);
			*fFood = fAddFood + *fFood;
			if (fAddFood < 0) {
			printf("Invalid Input.\n"); }
			else {
				displayDivider();
				printf("Food and Drinks:       %10.2f", *fFood);
			}
			} while (fAddFood < 0);
			}
		break;
		case 2:
			{
			do {
			printf("Add Expenses for Transportation: ");
			scanf("%f", &fAddTrans);
			*fTrans = fAddTrans + *fTrans;
			if (fAddTrans < 0) {
			printf("Invalid Input.\n"); }
			else {
				displayDivider();
				printf("Transportation:        %10.2f", *fTrans);
			}
			} while (fAddFood < 0);
			}
		break;
		case 3:
			{
			do {
			printf("Add Expenses for Healthcare: ");
			scanf("%f", &fAddHealth);
			*fHealth = fAddHealth + *fHealth;
			if (fAddHealth < 0) {
			printf("Invalid Input.\n"); }
			else {
			displayDivider();
			printf("Healthcare:            %10.2f", *fHealth);
			}
			} while (fAddFood < 0);
			}
		break;
		case 4:
			{
			do {	
			printf("Add Expenses for Housing and Utilities: ");
			scanf("%f", &fAddHouse);
			*fHouse = fAddHouse + *fHouse;
			if (fAddHouse < 0) {
			printf("Invalid Input.\n"); }
			else {
			displayDivider();
			printf("Housing and Utilities: %10.2f", *fHouse);
			}
			} while (fAddFood < 0);
			}
		break;
		case 5:
			{
			do {
			printf("Add Expenses for Leisure Activities: ");
			scanf("%f", &fAddLeisure);
			*fLeisure = fAddLeisure + *fLeisure;
			if (fAddLeisure < 0) {
			printf("Invalid Input.\n"); }
			else {
			displayDivider();
			printf("Leisure Activities:    %10.2f", *fLeisure);
			}
			} while (fAddFood < 0);
			}
		break;
		case 6:
			{
			do {
			printf("Add Expenses for Education: ");
			scanf("%f", &fAddEduc);
			*fEduc = fAddEduc + *fEduc;
			if (fAddEduc < 0) {
			printf("Invalid Input.\n"); }
			else {
			displayDivider();
			printf("Education:             %10.2f", *fEduc);
			}
			} while (fAddFood < 0);
			}
		break;
	}
		
	float fRemaining = *fAllowance - (*fFood + *fTrans + *fHealth + *fHouse + *fLeisure + *fEduc);
	*fExpenses = *fFood + *fTrans + *fHealth + *fHouse + *fLeisure + *fEduc;
	
	} while (nInput > 0);
	
	displayDivider();
		printf("Total Expenses:        %10.2f\n", *fExpenses);
			
	*fFood = *fFood, *fTrans = *fTrans, *fHealth = *fHealth, *fHouse = *fHouse, *fLeisure = *fLeisure, *fEduc = *fEduc;
}


/* This function starts the first day for the program and includes all options of
   adding expenses, adding and using savings, ending the day or month, and even
   updating your budget allocation. 
   This function also displays your budget report after ending each month.
   Precondition: *fFoodB must be at least 300, while *fHouseB must be at least 4000.
   				 The remaining variables must have non-negative values.
   @param *fAllowance is the monthly allowance of the user.
   @param *nDay is the value displayed on the Day Counter.
   @param *fFoodB is the daily allocated budget for Food and Drinks.
   @param *fTransB is the monthly allocated budget for Transportation services.
   @param *fHealthB is the monthly allocated budget for Healthcare Products and Services.
   @param *fHouseB is the monthly allocated budget for Housing and Utilities.
   @param *fLeisureB is the monthly allocated budget for Leisure Activities.
   @param *fEducB is the monthly allocated budget for Educational Purposes.
   @param *fFood is the expense for Food and Drinks.
   @param *fTransB is the monthly allocated budget for Transportation services.
   @param *fHealthB is the monthly allocated budget for Healthcare products.
   @param *fHouseB is the monthly allocated budget for Housing and Utilities.
   @param *fLeisureB is the monthly allocated budget for Leisure Activities.
   @param *fEducB is the monthly allocated budget for Educational purposes.
*/
void startBudget (float *fAllowance, int *nDay, float *fFoodB, float *fTransB,
			 float *fHealthB, float *fHouseB, float *fLeisureB, float *fEducB,
			 float *fFood, float *fTrans, float *fHealth, float *fHouse,
			 float *fLeisure, float *fEduc)
{
	char cOkay, cInput;
	int nDay30, nInput;
	int nMonth = 1, nMonthCheck;
	*nDay = 1;
	*fFoodB = 300, *fTransB, *fHealthB, *fHouseB = 4000, *fLeisureB, *fEducB;
	*fFood, *fTrans, *fHealth , *fHouse, *fLeisure=0, *fEduc;
	float fSavings, fSavings30, fExpenses, fAddSavings, fExpenses30;
	float fBalance = *fAllowance - (fSavings + fExpenses);
	do {		
	displayDivider();
	if ((nMonth % 10) == 1)
		printf("\n%dst Month\n", nMonth);
	else if ((nMonth % 10) == 2)
		printf("\n%dnd Month\n", nMonth);
	else if ((nMonth % 10) == 3)
		printf("\n%drd Month\n", nMonth);
	else 
		printf("\n%dth Month\n", nMonth);
	printf("Day Number %d\n\n", *nDay);
	printf("Balance: %.2f\n", fBalance);
	printf("Total Savings: %.2f\n", fSavings);
	printf("Current Month's Savings: %.2f\n", fSavings30);
	printf("Current Month's Expenses: %.2f\n", fExpenses);
	
	displayDivider ();
	printf("\n[A] Add expenses\n");
	printf("[B] Add Savings\n");
	printf("[C] Use Savings\n");
	printf("[D] End the Day\n");
	printf("[E] End the Month\n");
	printf("[F] Plan Your Expenses\n");
	printf("[X] Back to Main Menu\n");
	printf("\nEnter corresponding letter to access option: ");
	scanf(" %c", &cInput);
	
if (cInput == 120)
	{
	cInput = 88;
	}
	
switch (cInput)
	{
	case 'a':
	case 'A':
		{
		allocExpense(fAllowance, &fExpenses, fFood, fTrans, fHealth, fHouse, fLeisure, fEduc);
		fBalance = *fAllowance - (fExpenses + fSavings);
		printf("Remaining Balance:        %10.2f", fBalance);
		displayDivider();
		printf("Press any key to continue. ");
		scanf(" %c", &cOkay);
		
		}
	break;
	case 'b':
	case 'B':
		{
		do{
			printf("\n ENTER 0 TO GO BACK");
			printf("\nHow much savings do you want add?  ");
			scanf("%f", &fSavings30);
			if (fSavings30 > fBalance)
			{
				printf("!ENTERED SAVINGS MUST NOT BE MORE THAN YOUR CURRENT BALANCE!\n");
			}	
		} while (fSavings30 > fBalance || fSavings30 == 0);
		fSavings = fSavings + fSavings30;
		fBalance = *fAllowance - (fExpenses + fSavings);
		}
	break;
	case 'c':
	case 'C':
		{
		do {
			printf("\n ENTER 0 TO GO BACK");
			printf("\nHow much savings do you want to withdraw?  ");
			scanf("%f", &fAddSavings);
			if (fAddSavings > fSavings)
			{
				printf("!SAVINGS THAT WILL BE USED MUST BE EQUAL TO TOTAL SAVINGS AT MOST!\n");
			}
		} while (fAddSavings > fSavings || fAddSavings == 0);
		fSavings = fSavings - fAddSavings;
		fSavings30 = fSavings30 - fAddSavings;
		if (fSavings30 < fAddSavings)
		{
			fSavings30 = 0;
		}
		fBalance = fBalance - fExpenses + fAddSavings;
		}
	break;
	case 'd':
	case 'D':
		{	
			char cInput;
			printf("\nEnding the day deducts 300.00 from your Balance for Food and Drinks.");
			printf("\n\n\t[1] YES   [ANY] BACK\n");
			printf("Are you sure you want to end the day? ");
			scanf(" %c", &cInput);
			if (cInput == 49)
			{
			*nDay = *nDay + 1;
			nMonthCheck = (*nDay % 30) * (*nDay > 1);
			if (nMonthCheck == 1)
			{
				fSavings30 = 0;
				fExpenses = 4000 + 300;
				*fFood = *fFood + 300;
				*fHouse = *fHouse + 4000;
				fBalance = fBalance - fExpenses + *fAllowance;
				fSavings30 = 0;
				fExpenses = 0;
			printf("\n!ALERT!\n!4000.00 has been deducted from your Balance in expense for Rent!\n");
			displayDivider ();
			if ((nMonth % 10) == 1)
			printf("SUMMARY OF THE %dst MONTH", nMonth);	
			else if ((nMonth % 10) == 2)
			printf("SUMMARY OF THE %dnd MONTH", nMonth);
			else if ((nMonth % 10) == 3)
			printf("SUMMARY OF THE %drd MONTH", nMonth);
			else
			printf("SUMMARY OF THE %dth MONTH", nMonth);	
			float MinusFood = (*fFoodB * 30) - *fFood;
			float MinusTrans = *fTransB - *fTrans;
			float MinusHealth = *fHealthB - *fHealth;
			float MinusHouse = *fHouseB - *fHouse;
			float MinusLeisure = *fLeisureB - *fLeisure;
			float MinusEduc = *fEducB - *fEduc;
			printf("\nALLOCATED BUDGET - EXPENSES");
			printf("\nFood and Drinks:         %10.2f   -   %10.2f   =   %10.2f", *fFoodB * 30, *fFood, MinusFood);
			printf("\nTransportation:          %10.2f   -   %10.2f   =   %10.2f", *fTransB, *fTrans, MinusTrans);
			printf("\nHealthcare:              %10.2f   -   %10.2f   =   %10.2f", *fHealthB, *fHealth, MinusHealth);
			printf("\nHousing and Utilities:   %10.2f   -   %10.2f   =   %10.2f", *fHouseB, *fHouse, MinusHouse);
			printf("\nLeisure Activities:      %10.2f   -   %10.2f   =   %10.2f", *fLeisureB, *fLeisure, MinusLeisure);
			printf("\nEducation:               %10.2f   -   %10.2f   =   %10.2f", *fEducB, *fEduc, MinusEduc);
			displayDivider ();
			if (MinusFood < 0 || MinusTrans < 0 || MinusHealth < 0 || MinusHouse < 0 || MinusLeisure < 0 || MinusEduc < 0)
			{
				printf("You have spent more than the allocated budget for the following categories:");
				if (MinusFood < 0)
				printf("\n> Food and Drinks");
				if (MinusTrans < 0)
				printf("\n> Transportation");
				if (MinusHealth < 0)
				printf("\n> Healthcare");
				if (MinusHouse < 0)
				printf("\n> Housing and Utilities");
				if (MinusLeisure >= 0)
				{
				} else { 
				printf("\n> Leisure Activities");
				}
				if(MinusEduc < 0)
				printf("\n> Education");
			}
			else
			{
				printf("\nCongrats! You did not spend more than the allocated budget for each category!\n");
			}
			printf("\nPress any key to continue. ");
			scanf(" %c", &cOkay);
			*fFood = 0;
			*fTrans = 0;
			*fHealth = 0;
			*fHouse = 0;
			*fLeisure = 0;
			*fEduc = 0;
			} else
			{
			*fFood = *fFood + 300;
			fExpenses = fExpenses + 300;
			fBalance = *fAllowance - fExpenses;
			}
			}
	break;
	case 'e':
	case 'E':
		{
			if (*nDay % 30 == 0)
			{
				printf("\n!ALERT!\nThe only available option is to end the day.");
				printf("\nPress any key to continue. ");
				scanf(" %c", &cOkay);
			} else
			{
			printf("\n[1] YES   [0] BACK TO MAIN MENU\n");
			if ((nMonth % 10) == 1)
			printf("Are you sure you want to end the %dst month? ", nMonth);
			else if ((nMonth % 10) == 2)
			printf("Are you sure you want to end the %dnd month? ", nMonth);
			else if ((nMonth % 10) == 3)
			printf("Are you sure you want to end the %drd month? ", nMonth);
			else
			printf("Are you sure you want to end the %dth month? ", nMonth);
			scanf("%d", &nInput);
			
			if (nInput == 1)
			{
			fSavings30 = 0;
			nDay30 = ((30 * nMonth) - *nDay);
			displayDivider();
			if (nDay30 == 1)
			printf("You have skipped %d day.", nDay30);
			else 
			printf("You have skipped %d days.", nDay30);	
			*nDay = *nDay + nDay30;
			fExpenses30 = nDay30 * 300;
			*fFood = *fFood + fExpenses30;
			displayDivider ();
			printf("\n!ALERT!\n%.2f was deducted from your Balance in expense for Food and Drinks.\n", fExpenses30);
			printf("Press any key to continue. ");
			scanf(" %c", &cOkay);
			fExpenses = fExpenses + fExpenses30;
			fBalance = fBalance - fExpenses;
			nMonth ++;
			}
			}
		}
		}
	break;
	case 'f':
	case 'F':
		{
			allocBudget(fAllowance, fFoodB, fTransB, fHealthB, fHouseB, fLeisureB, fEducB);
		}
	break;
	case 'x':
	case 'X':
		{
		}
	break;
		default:
		{
		printf("\n\nInvalid Input!\n");
		}
	}
	} while (cInput != 88);
}


int main()
{
	float fAllowance;
	char cInput = '0', nDay;
	float fFood, fTrans, fHealth, fHouse, fLeisure, fEduc;
	float fFoodB, fTransB, fHealthB, fHouseB, fLeisureB, fEducB;
	displayTitle();
	do {
	displayDivider();
	printf("\nM A I N   M E N U\n");
	printf("\n[1] Enter/Edit Your Allowance\n");
	printf("[2] Plan Your Expenses\n");
	printf("[3] Start Your Budgeting Journey\n");
	printf("[0] Exit\n");
	printf("\nEnter corresponding number to access option: ");
	scanf(" %c", &cInput);
	
	switch (cInput)
	{
		case '0':
			{
				printf("\n[Y] YES [ANY] NO\n");
				printf("Are you sure you want to exit AllowIt? ");
				scanf(" %c", &cInput);
				if (cInput == 'Y' || cInput == 'y')
				{
					cInput = '0';
				}
			}
		break;
		case '1':
			{
			getAllowance(&fAllowance);
			}
		break;
		case '2':
			{
			if (fAllowance < 13000)
			getAllowance(&fAllowance);
			if (fAllowance == 0)
			break;
			allocBudget(&fAllowance, &fFoodB, &fTransB, &fHealthB,
					&fHouseB, &fLeisureB, &fEducB);
			}
		break;
		case '3':
		{
			if (fAllowance < 13000)
			getAllowance(&fAllowance);
			if (fAllowance == 0)
			break;
			startBudget(&fAllowance, &nDay, &fFoodB, &fTransB,
			 &fHealthB, &fHouseB, &fLeisureB, &fEducB, &fFood,
			 &fTrans, &fHealth, &fHouse, &fLeisure, &fEduc);
		}
		break;
		default:
			{
				printf("\nInvalid Input!");
				cInput = '1';
			}
	}
	} while (cInput != '0');
	return 0;
}
