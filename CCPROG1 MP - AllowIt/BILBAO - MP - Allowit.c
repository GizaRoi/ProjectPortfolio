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
Last modified: December 4, 2022
Version: 2.4.2
Acknowledgements: patorjk Text to ASCII Art Generator (https://patorjk.com/software/taag/)
****************************************************************************/

#include <stdio.h>
/* This function displays the title at the main menu.
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
	printf("\n%s%s%s%s\n","-------------------", "-------------------", "-------------------", "-------------------");
}


/* This function gets the allowance from the input of the user which will be used by the program.
   Precondition: *fAllowance must be more than or equal to 13000.
   @param *fAllowance is the monthly allowance of the user.
   @param *cInput is the confirmation input that locks the values in place or resets them to default.
*/
void getAllowance (float *fAllowance, char *cInput)
{
	float fNewAllowance;
	do {
	printf("\n[0] BACK TO MAIN MENU\n");
	printf("Previously Entered Allowance: %.2f\n", *fAllowance);
	printf("Monthly Allowance:\n");
	printf("How much money do you acquire in a month?  ");
	scanf("%f", &fNewAllowance);
	if (fNewAllowance == 0)
	{
	}
	else if (fNewAllowance < 0)
		printf("\nInvalid Input.\n");
	else if (fNewAllowance < 13000)
		printf("\n!MINIMUM ALLOWANCE MUST BE 13000!\n");
	} while (fNewAllowance < 13000 && fNewAllowance != 0);
	if (fNewAllowance != 0 && fNewAllowance > 0)
	{
		printf("\n\t  [1] YES   [ANY] BACK TO MAIN MENU\n");
		printf("Do you confirm your allowance of %.2f per month? ", fNewAllowance);
		scanf(" %c", cInput);
		if (*cInput == '1')
			*fAllowance = fNewAllowance;
		else
			*fAllowance = *fAllowance;
	}
}

/* This function allocates the budget for each expense category that will be used for
   assessing the monthly expenses of the user.
   Precondition: *fTransB, *fHealthB, *fLeisureB, and *fEducB are non-negative values,
   while *fALlowance must be more than or equal to 13000, *fFoodB must be at least 300, and *fHouseB must be at least 4000.
   @param *fAllowance is the monthly allowance of the user.
   @param *fFoodB is the daily allocated budget for Food and Drinks.
   @param *fTransB is the monthly allocated budget for Transportation services.
   @param *fHealthB is the monthly allocated budget for Healthcare Products and Services.
   @param *fHouseB is the monthly allocated budget for Housing and Utilities.
   @param *fLeisureB is the monthly allocated budget for Leisure Activities.
   @param *fEducB is the monthly allocated budget for Educational Purposes.
   @param *cInput is the confirmation input that locks the values in place or resets them to default.
*/
void allocBudget (float *fBalance, float *fFoodB, float *fTransB,
			 float *fHealthB, float *fHouseB, float *fLeisureB, float *fEducB, char *cInput)
{
	int nInput;
	char cOkay;
	float fRemainingB, fTotalBudget;
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
	printf("Choose a Budget Category:  ");
	scanf("%d", &nInput);
	
	switch (nInput)
	{
		case 1: // Budget Allocation for Food and Drinks
			{
			do {
			printf("\n[0] GO BACK");
			printf("\nAllocate Budget for Food and Drinks:  ");
			scanf("%f", fFoodB);
			if (*fFoodB < 300 && *fFoodB != 0)
			printf("\n!MINIMUM BUDGET FOR FOOD AND DRINKS IS 300!\n");
			if (*fFoodB == 0)
			*fFoodB = 300;
			} while (*fFoodB < 300 && *fFoodB != 0);
			}
		break;
		case 2: // Budget Allocation for Transportation
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
		case 3: // Budget Allocation for Healthcare Products and Services
			{
			do{
			printf("\n[0] GO BACK");
			printf("\nAllocate Budget for Healthcare:  ");
			scanf("%f", fHealthB);
			if (*fHealthB < 0 && *fHealthB)
			printf("Invalid Input.\n");
			} while (*fHealthB < 0);
			}
		break;
		case 4: // Budget Allocation for Housing and Utilities
			{	
			do {
			printf("\n[0] GO BACK");
			printf("\nAllocate Budget for Housing and Utilities:  ");
			scanf("%f", fHouseB);
			if (*fHouseB < 4000 && *fHouseB != 0)
			printf("\n!MINIMUM BUDGET FOR HOUSING AND UTILITIES IS 4000!\n");
			if (*fHouseB == 0)
			*fHouseB = 4000;
			} while (*fHouseB < 4000 && *fHouseB != 0);
			}
		break;
		case 5: // Budget Allocation for Leisure Activities
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
		case 6: // Budget Allocation for Educational Purposes
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
		case 0: // Finishes the Budget Allocation and displays the budget breakdown
			{
			printf("\n [1] YES   [ANY] BACK\n");
			printf("Do you confirm your budget allocation? ");
			scanf(" %c", cInput);
			if (*cInput == '1')
			{
				printf("\nBUDGET BREAKDOWN: \n");
				fTotalBudget = (*fFoodB * 30) + *fTransB + *fHealthB + *fHouseB + *fLeisureB + *fEducB;
				fRemainingB = *fBalance - fTotalBudget;

				displayDivider();
	
				printf("Food and Drinks x 30:    %10.2f\n", *fFoodB * 30);
				printf("Transportation:          %10.2f\n", *fTransB);
				printf("Healthcare:              %10.2f\n", *fHealthB);
				printf("Housing and Utilities:   %10.2f\n", *fHouseB);
				printf("Leisure Activities:      %10.2f\n", *fLeisureB);
				printf("Education:               %10.2f\n", *fEducB);

				displayDivider();

				printf("Balance:                 %10.2f\n", *fBalance);
				printf("Total Budget:            %10.2f\n", fTotalBudget);
				printf("Remaining Allowance:     %10.2f", fRemainingB);

				if (fRemainingB < 0) // Resets Budget Values if Total Budget exceeds the Monthly Allowance
				{
					printf("\n!TOTAL BUDGET ALLOCATION MUST NOT BE GREATER THAN YOUR CURRENT BALANCE!");
					*fFoodB = 300, *fTransB = 0, *fHealthB = 0, *fHouseB = 4000; *fLeisureB = 0, *fEducB = 0;
				}
				printf("\n\nPress any key to continue. ");
				scanf(" %c", &cOkay);
				displayDivider();
			}
			else // Resets Budget Values if the Budget Allocation is not confirmed.
			{
			*fFoodB = 300, *fTransB = 0, *fHealthB = 0, *fHouseB = 4000; *fLeisureB = 0, *fEducB = 0;	
			} 
			}
		break;
		default:
			printf("\nInvalid Input!\n");
	}
	}while (nInput != 0 || fRemainingB < 0);
	
	*fFoodB = *fFoodB, *fTransB = *fTransB, *fHealthB = *fHealthB, *fHouseB = *fHouseB, *fLeisureB = *fLeisureB, *fEducB = *fEducB;
}

/* This function adds expenses for each of the 6 expense categories and displays the user's total expenses and remaining balance.
   Precondition: *fAllowance, *fExpenses, *fFood, *fTrans, *fHealthB, *fHouse, *fLeisure, and *fEduc 
   are non-negative values.
   @param *fBalance is the amount of money the user has.
   @param *fExpenses is the total expenses for the 6 expense categories.
   @param *fAddExpenses is the amount of expenses to be deducted to the balance.
   @param *fFood is the expense for Food and Drinks.
   @param *fTrans is the expense for Transportation Services.
   @param *fHealth is the expense for Healthcare Products and Services.
   @param *fHouse is the expense for Housing and Utilities.
   @param *fLeisure is the expense for Leisure Activities.
   @param *fEduc is the expense for Educational Purposes.
*/
void allocExpense (float *fBalance, float *fExpenses, float *fAddExpenses, float *fFood, float *fTrans,
			 float *fHealth, float *fHouse, float *fLeisure, float *fEduc)
{
	int nInput;
	char cOkay;
	float fAddFood=0, fAddTrans=0, fAddHealth=0, fAddHouse=0, fAddLeisure=0, fAddEduc=0;
	float fAddFood2=0, fAddTrans2=0, fAddHealth2=0, fAddHouse2=0, fAddLeisure2=0, fAddEduc2=0;
	
	do {
	displayDivider();
	printf("\nE X P E N S E   C A T E G O R I E S\n");
	printf("\n[1] Food and Drinks\n");
	printf("[2] Transportation\n");
	printf("[3] Healthcare\n");
	printf("[4] Housing and Utilities\n");
	printf("[5] Leisure\n");
	printf("[6] School\n");
	printf("[0] Finish Your Spendings\n");
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
			scanf("%f", &fAddFood2);
			if (fAddFood2 < 0) {
			printf("Invalid Input.\n"); 
			fAddFood2 = 0; }
			else {
				*fFood = fAddFood2 + *fFood;
				fAddFood = fAddFood + fAddFood2;
				*fAddExpenses = fAddFood + fAddTrans + fAddHealth + fAddHouse + fAddLeisure + fAddEduc;
				if (*fAddExpenses <= *fBalance)
				printf("\nFood and Drinks:       %10.2f", *fFood);
				}
			if (*fAddExpenses > *fBalance)
			{
				displayDivider();
				printf("Your expenses have gone beyond your current balance.");
				displayDivider();
				*fFood = *fFood - fAddFood2;
				fAddFood = fAddFood - fAddFood2;
				fAddFood2 = 0;
			}
			} while (fAddFood2 < 0 || *fAddExpenses > *fBalance);
			}	
		break;
		case 2:
			{
			do {
			printf("Add Expenses for Transportation: ");
			scanf("%f", &fAddTrans2);
			if (fAddTrans2 < 0) {
			printf("Invalid Input.\n");
			fAddTrans2 = 0; }
			else {
				*fTrans = fAddTrans2 + *fTrans;
				fAddTrans = fAddTrans + fAddTrans2;
				*fAddExpenses = fAddFood + fAddTrans + fAddHealth + fAddHouse + fAddLeisure + fAddEduc;
				if (*fAddExpenses <= *fBalance)
				printf("\nTransportation:        %10.2f", *fTrans);
			}
			*fAddExpenses = fAddFood + fAddTrans + fAddHealth + fAddHouse + fAddLeisure + fAddEduc;
			if (*fAddExpenses > *fBalance)
			{
				displayDivider();
				printf("Your expenses have gone beyond your current balance.");
				displayDivider();
				*fTrans = *fTrans - fAddTrans2;
				fAddTrans = fAddTrans - fAddTrans2;
				fAddTrans2 = 0;
			}
			} while (fAddTrans2 < 0 || *fAddExpenses > *fBalance);
			}
		break;
		case 3:
			{
			do {
			printf("Add Expenses for Healthcare: ");
			scanf("%f", &fAddHealth2);
			if (fAddHealth2 < 0) {
			printf("Invalid Input.\n");
			fAddHealth2 = 0; }
			else {
				*fHealth = fAddHealth2 + *fHealth;
				fAddHealth += fAddHealth2;
				*fAddExpenses = fAddFood + fAddTrans + fAddHealth + fAddHouse + fAddLeisure + fAddEduc;
				if (*fAddExpenses <= *fBalance)
				printf("\nHealthcare:            %10.2f", *fHealth);
			}
			*fAddExpenses = fAddFood + fAddTrans + fAddHealth + fAddHouse + fAddLeisure + fAddEduc;
			if (*fAddExpenses > *fBalance)
			{
				displayDivider();
				printf("Your expenses have gone beyond your current balance.");
				displayDivider();
				*fHealth = *fHealth - fAddHealth2;
				fAddHealth -= fAddHealth2;
			}
			} while (fAddHealth2 < 0 || *fAddExpenses > *fBalance);
			}
		break;
		case 4:
			{
			do {	
			printf("Add Expenses for Housing and Utilities: ");
			scanf("%f", &fAddHouse2);
			if (fAddHouse2 < 0) {
			printf("Invalid Input.\n");
			fAddHouse2 = 0; }
			else {
				*fHouse = fAddHouse2 + *fHouse;
				fAddHouse += fAddHouse2;
				*fAddExpenses = fAddFood + fAddTrans + fAddHealth + fAddHouse + fAddLeisure + fAddEduc;
				if (*fAddExpenses <= *fBalance)
			printf("Housing and Utilities: %10.2f", *fHouse);
			}
			*fAddExpenses = fAddFood + fAddTrans + fAddHealth + fAddHouse + fAddLeisure + fAddEduc;
			if (*fAddExpenses > *fBalance)
			{
				displayDivider();
				printf("Your expenses have gone beyond your current balance.");
				displayDivider();
				*fHouse -= fAddHouse2;
				fAddHouse -= fAddHouse2;
			}
			} while (fAddHouse2 < 0 || *fAddExpenses > *fBalance);
			}
		break;
		case 5:
			{
			do {
			printf("Add Expenses for Leisure Activities: ");
			scanf("%f", &fAddLeisure2);
			if (fAddLeisure2 < 0) {
			printf("Invalid Input.\n");
			fAddLeisure2 = 0; }
			else {
				*fLeisure = fAddLeisure2 + *fLeisure;
				fAddLeisure += fAddLeisure2;
				*fAddExpenses = fAddFood + fAddTrans + fAddHealth + fAddHouse + fAddLeisure + fAddEduc;
				if (*fAddExpenses <= *fBalance)
			printf("\nLeisure Activities:    %10.2f", *fLeisure);
			}
			*fAddExpenses = fAddFood + fAddTrans + fAddHealth + fAddHouse + fAddLeisure + fAddEduc;
			if (*fAddExpenses > *fBalance)
			{
				displayDivider();
				printf("Your expenses have gone beyond your current balance.");
				displayDivider();
				*fLeisure -= fAddLeisure2;
				fAddLeisure -= fAddLeisure2;
			}
			} while (fAddLeisure2 < 0 || *fAddExpenses > *fBalance);
			}
		break;
		case 6:
			{
			do {
			printf("Add Expenses for Education: ");
			scanf("%f", &fAddEduc2);
			if (fAddEduc2 < 0) {
			printf("\nInvalid Input.\n");
			fAddEduc2 = 0; }
			else {
				*fEduc = fAddEduc2 + *fEduc;
				fAddEduc = fAddEduc + fAddEduc2;
				*fAddExpenses = fAddFood + fAddTrans + fAddHealth + fAddHouse + fAddLeisure + fAddEduc;
				if (*fAddExpenses <= *fBalance)
			printf("Education:             %10.2f", *fEduc);
			}
			*fAddExpenses = fAddFood + fAddTrans + fAddHealth + fAddHouse + fAddLeisure + fAddEduc;
			if (*fAddExpenses > *fBalance)
			{
				displayDivider();
				printf("Your expenses have gone beyond your current balance.");
				displayDivider();
				*fEduc = *fEduc - fAddEduc2;
				fAddEduc -= fAddEduc2;
			}
			} while (fAddEduc2 < 0 || *fAddExpenses > *fBalance);
			}
		break;
		default:
			{
				printf("Invalid Input.\n");
			}
	}
	} while (nInput > 0);
	*fAddExpenses = fAddFood + fAddTrans + fAddHealth + fAddHouse + fAddLeisure + fAddEduc;
	*fExpenses += *fAddExpenses;
	float fRemaining = *fBalance - *fExpenses;
	fAddFood = 0, fAddTrans = 0, fAddHealth = 0, fAddHouse = 0, fAddLeisure = 0, fAddEduc = 0;
	*fFood = *fFood, *fTrans = *fTrans, *fHealth = *fHealth, *fHouse = *fHouse, *fLeisure = *fLeisure, *fEduc = *fEduc;
}

/* This function adds savings based on user input.
   Precondition: All variables must have non-negative values, and *fSavings & *fSavings30 
   must be less than or equal to *fBalance.
   @param *fBalance is the amount of currency the user has after expenses.
   @param *fSavings is the total amount of savings the user has.
   @param *fSavings30 is the amount of savings the user has in their current month. 
*/
void addSavings(float *fBalance, float *fSavings, float *fSavings30)
{
	float fAddSavings;
	do{
			printf("\n ENTER 0 TO GO BACK");
			printf("\nHow much savings do you want add?  ");
			scanf("%f", &fAddSavings);
			if (fAddSavings > *fBalance)
			{
				printf("!ADDED SAVINGS MUST NOT BE MORE THAN YOUR CURRENT BALANCE!\n");
			}	
			if (fAddSavings < 0)
			{
				printf("Invalid Input.\n");
				fAddSavings = 0;
			}
		} while (fAddSavings > *fBalance && fAddSavings != 0);
		*fSavings = *fSavings + fAddSavings;
		*fSavings30 = *fSavings30 + fAddSavings;
		*fBalance = *fBalance - fAddSavings;
}

/* This function consumes the user's savings based on input and adds it back to their balance.
   Precondition: All variables must have non-negative values, and *fUseSavings must be
   less than or equal to *fSavings.
   @param *fUseSavings is the amount of savings to be added back to the balance.
   @param *fSavings is the total amount of savings the user has.
   @param *fSavings30 is the amount of savings the user has in their current month. 
*/
void useSavings(float *fUseSavings, float *fSavings, float *fSavings30)
{
	do {
			printf("\n ENTER 0 TO GO BACK");
			printf("\nHow much savings do you want to withdraw?  ");
			scanf("%f", fUseSavings);
			if (*fUseSavings > *fSavings)
			{
				printf("!SAVINGS THAT WILL BE USED MUST BE EQUAL TO TOTAL SAVINGS AT MOST!\n");
			}
			if (*fUseSavings < 0)
			{
				printf("Invalid Input.\n");
				*fUseSavings = 0;
			}
		} while (*fUseSavings > *fSavings && *fUseSavings != 0);
		*fSavings = *fSavings - *fUseSavings;
		if (*fUseSavings >= *fSavings30)
		*fSavings30 = 0;
		else
		*fSavings30 = *fSavings30 - *fUseSavings;
}

/* This function diplays a breakdown of allocated budgets and expenses for each category,
   and then gives feedback based on the comparison of each corresponding budget and expense
   on every category.
   Precondition: All variables are non-negative values, and *fAllowance must be more than
   or equal to 13000.
   @param *fAllowance is the monthly allowance of the user.
   @param *fFood is the expense for Food and Drinks.
   @param *fTrans is the expense for Transportation Services.
   @param *fHealth is the expense for Healthcare Products and Services.
   @param *fHouse is the expense for Housing and Utilities.
   @param *fLeisure is the expense for Leisure Activities.
   @param *fEduc is the expense for Educational Purposes.
   @param *fFoodB is the daily allocated budget for Food and Drinks.
   @param *fTransB is the monthly allocated budget for Transportation services.
   @param *fHealthB is the monthly allocated budget for Healthcare Products and Services.
   @param *fHouseB is the monthly allocated budget for Housing and Utilities.
   @param *fLeisureB is the monthly allocated budget for Leisure Activities.
   @param *fEducB is the monthly allocated budget for Educational Purposes.
*/
void displayStats(float *fBalance, float *fFood, float *fTrans, float *fHealth, float *fHouse, 
				float *fLeisure, float *fEduc, float *fFoodB, float *fTransB, 
				float *fHealthB, float *fHouseB, float *fLeisureB, float *fEducB)
{	
		float MinusFood = (*fFoodB * 30) - *fFood;
		float MinusTrans = *fTransB - *fTrans;
		float MinusHealth = *fHealthB - *fHealth;
		float MinusHouse = *fHouseB - *fHouse;
		float MinusLeisure = *fLeisureB - *fLeisure;
		float MinusEduc = *fEducB - *fEduc;
		float fTotalBudget = (*fFoodB * 30) + *fTransB + *fHealthB + *fHouseB + *fLeisureB + *fEducB;
		float fTotalExpense = *fFood + *fTrans + *fHealth + *fHouse + *fLeisure + *fEduc;
		
		printf("\nALLOCATED BUDGET - EXPENSES");
		printf("\nFood and Drinks:         %10.2f   -   %10.2f   =   %10.2f", *fFoodB * 30, *fFood, MinusFood);
		printf("\nTransportation:          %10.2f   -   %10.2f   =   %10.2f", *fTransB, *fTrans, MinusTrans);
		printf("\nHealthcare:              %10.2f   -   %10.2f   =   %10.2f", *fHealthB, *fHealth, MinusHealth);
		printf("\nHousing and Utilities:   %10.2f   -   %10.2f   =   %10.2f", *fHouseB, *fHouse, MinusHouse);
		printf("\nLeisure Activities:      %10.2f   -   %10.2f   =   %10.2f", *fLeisureB, *fLeisure, MinusLeisure);
		printf("\nEducation:               %10.2f   -   %10.2f   =   %10.2f", *fEducB, *fEduc, MinusEduc);
		printf("\nTotality:                %10.2f   -   %10.2f   =   %10.2f", fTotalBudget, fTotalExpense, fTotalBudget - fTotalExpense);
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
			if (MinusLeisure < 0)
				printf("\n> Leisure Activities");
			if(MinusEduc < 0)
				printf("\n> Education");
		}
		else
		{
			printf("\nCongrats! You did not spend more than the allocated budget for each category!");
		}
		if (fTotalExpense <= fTotalBudget)
			printf("\n\nOverall, your spendings have not gone over your budget limit.\n");
		else
			printf("\n\nOverall, your spendings have gone over your budget limit.\n");
		if (MinusFood < 0 || MinusTrans < 0 || MinusHealth < 0 || MinusHouse < 0 || MinusLeisure < 0 || MinusEduc < 0)
			printf("\nTIP: You might want to allocate your budget first if you haven't already!\n");
}

/* This function ends the day for the program, and does the necessary computations for expenses
   and other variables based on what day it passed by.
   Precondition: All variables are non-negative values.
   @param *fAllowance is the monthly allowance of the user.
   @param *fBalance is the amount of currency the user has after expenses.
   @param *fExpenses is the total expenses for the 6 expense categories.
   @param *fSavings30 is the amount of savings the user has in their current month. 
   @param *fFood is the expense for Food and Drinks.
   @param *fTrans is the expense for Transportation Services.
   @param *fHealth is the expense for Healthcare Products and Services.
   @param *fHouse is the expense for Housing and Utilities.
   @param *fLeisure is the expense for Leisure Activities.
   @param *fEduc is the expense for Educational Purposes.
   @param *fFoodB is the daily allocated budget for Food and Drinks.
   @param *fTransB is the monthly allocated budget for Transportation services.
   @param *fHealthB is the monthly allocated budget for Healthcare Products and Services.
   @param *fHouseB is the monthly allocated budget for Housing and Utilities.
   @param *fLeisureB is the monthly allocated budget for Leisure Activities.
   @param *fEducB is the monthly allocated budget for Educational Purposes.
   @param *nDay is the day count of the program.
   @param *nMonth is the month count of the program.
*/
void endDay (float *fAllowance, float *fBalance, float *fExpenses, float *fSavings30, float *fFood, 
			float *fTrans, float *fHealth, float *fHouse, float *fLeisure,
			float *fEduc, float *fFoodB, float *fTransB, float *fHealthB, 
			float *fHouseB, float *fLeisureB, float *fEducB, int *nDay, int *nMonth)
{
		char cInput, cOkay;
		printf("\nEnding the day deducts 300.00 from your Balance for Food and Drinks.");
		printf("\n\n\t[1] YES   [ANY] BACK\n");
		printf("Are you sure you want to end the day? ");
		scanf(" %c", &cInput);
		if (cInput == '1')
		{
		*nDay = *nDay + 1;
		int nMonthCheck = (*nDay % 30) * (*nDay > 1);
		if (nMonthCheck == 1)
		{	
			*fSavings30 = 0; *fExpenses = 4000 + 300;
			*fFood = *fFood + 300; *fHouse = *fHouse + 4000;
			*fBalance = *fBalance - *fExpenses;
			*fSavings30 = 0; *fExpenses = 0;
		
		if (*fBalance < 0)
		{
			printf("\n!ALERT!\n");
			printf("!YOU DON'T HAVE ENOUGH MONEY TO PAY RENT!");
		}
		else
		{
		printf("\n!ALERT!\n!4000.00 has been deducted from your Balance in expense for Rent!\n");
		displayDivider ();
		if ((*nMonth % 10) == 1 && (*nMonth < 11 || *nMonth > 13))
		printf("SUMMARY OF THE %dst MONTH", *nMonth);	
		else if ((*nMonth % 10) == 2 && (*nMonth < 11 || *nMonth > 13))
		printf("SUMMARY OF THE %dnd MONTH", *nMonth);
		else if ((*nMonth % 10) == 3 && (*nMonth < 11 || *nMonth > 13))
		printf("SUMMARY OF THE %drd MONTH", *nMonth);
		else
		printf("SUMMARY OF THE %dth MONTH", *nMonth);
		
		displayStats(fBalance, fFood, fTrans, fHealth, fHouse, fLeisure, fEduc,
				fFoodB, fTransB, fHealthB, fHouseB, fLeisureB, fEducB);
				
		displayDivider();
		
		*nMonth = *nMonth + 1;
		*fFood = 0; *fTrans = 0; *fHealth = 0; *fHouse = 0; *fLeisure = 0; *fEduc = 0;
		
		printf("\nYou have received your monthly allowance of %.2f for the ", *fAllowance);
		
		if ((*nMonth % 10) == 1 && (*nMonth < 11 || *nMonth > 13))
			printf("%dst month.", *nMonth);	
		else if ((*nMonth % 10) == 2 && (*nMonth < 11 || *nMonth > 13))
			printf("%dnd month.", *nMonth);
		else if ((*nMonth % 10) == 3 && (*nMonth < 11 || *nMonth > 13))
			printf("%drd month.", *nMonth);
		else
			printf("%dth month.", *nMonth);
		if ((*nMonth % 10) == 1 && (*nMonth < 11 || *nMonth > 13))
			printf("\n\nBalance for the %dst Month: ", *nMonth);	
		else if ((*nMonth % 10) == 2 && (*nMonth < 11 || *nMonth > 13))
			printf("\n\nBalance for the %dnd Month: ", *nMonth);
		else if ((*nMonth % 10) == 3 && (*nMonth < 11 || *nMonth >=13))
			printf("\n\nBalance for the %drd Month: ", *nMonth);
		else
			printf("\n\nBalance for the %dth Month: ", *nMonth);
			
		printf("%8.2f + %8.2f = %8.2f", *fBalance, *fAllowance, *fBalance + *fAllowance);
		
		*fBalance = *fBalance + *fAllowance;
		
		printf("\n\nPress any key to continue. ");
		scanf(" %c", &cOkay);
		} 
		}
		else
		{
			*fFood = *fFood + 300;
			*fBalance = *fBalance - 300;
			*fExpenses = *fExpenses + 300;
		}	
		}
}

/* This function ends the month for the program and does the computations on necessary variables
   based on what day the function got used.
   Precondition: All variables are non-negative values.
   @param *fBalance is the amount of currency the user has after expenses.
   @param *fExpenses is the total expenses for the 6 expense categories.
   @param *fFood is the expense for Food and Drinks.
   @param *nDay is the day count of the program.
   @param *nMonth is the month count of the program.
*/
void endMonth (float *fBalance, float *fExpenses, float *fFood, int *nDay, int *nMonth)
{
	int nInput; char cOkay;
		if (*nDay % 30 == 0)
			{
				printf("\n!ALERT!\nThe only available option is to end the day.");
				printf("\nPress any key to continue. ");
				scanf(" %c", &cOkay);
			} else
			{
			printf("\n[1] YES   [0] BACK TO MAIN MENU\n");
			if ((*nMonth % 10) == 1 && (*nMonth < 11 || *nMonth > 13))
			printf("Are you sure you want to end the %dst month? ", *nMonth);
			else if ((*nMonth % 10) == 2 && (*nMonth < 11 || *nMonth > 13))
			printf("Are you sure you want to end the %dnd month? ", *nMonth);
			else if ((*nMonth % 10) == 3 && (*nMonth < 11 || *nMonth > 13))
			printf("Are you sure you want to end the %drd month? ", *nMonth);
			else
			printf("Are you sure you want to end the %dth month? ", *nMonth);
			scanf("%d", &nInput);
			
			if (nInput == 1)
			{
			int nDay30 = ((30 * *nMonth) - *nDay);
			displayDivider();
			if (nDay30 == 1)
			printf("You have skipped %d day.", nDay30);
			else 
			printf("You have skipped %d days.", nDay30);	
			*nDay = *nDay + nDay30;
			float fExpenses30 = nDay30 * 300;
			*fFood = *fFood + fExpenses30;
			displayDivider ();
			printf("\n!ALERT!\n%.2f was deducted from your Balance in expense for Food and Drinks.\n", fExpenses30);
			printf("Press any key to continue. ");
			scanf(" %c", &cOkay);
			*fExpenses = *fExpenses + fExpenses30;
			*fBalance = *fBalance - fExpenses30;
			}
			}
}

/* This function displays the menu for ending the day or the momth.
   Precondition: All variables are non-negative values, *fAllowance must be more than or equal to 13000,
   @param *fAllowance is the monthly allowance of the user.
   @param *fBalance is the amount of currency the user has after expenses.
   @param *fExpenses is the total expenses for the 6 expense categories.
   @param *fSavings30 is the amount of savings the user has in their current month. 
   @param *fFood is the expense for Food and Drinks.
   @param *fTrans is the expense for Transportation Services.
   @param *fHealth is the expense for Healthcare Products and Services.
   @param *fHouse is the expense for Housing and Utilities.
   @param *fLeisure is the expense for Leisure Activities.
   @param *fEduc is the expense for Educational Purposes.
   @param *fFoodB is the daily allocated budget for Food and Drinks.
   @param *fTransB is the monthly allocated budget for Transportation services.
   @param *fHealthB is the monthly allocated budget for Healthcare Products and Services.
   @param *fHouseB is the monthly allocated budget for Housing and Utilities.
   @param *fLeisureB is the monthly allocated budget for Leisure Activities.
   @param *fEducB is the monthly allocated budget for Educational Purposes.
   @param *nDay is the day count of the program.
   @param *nMonth is the month count of the program.
*/
void endDayMonthMenu(float *fAllowance, float *fBalance, float *fExpenses, int *nDay, int *nMonth,
					float *fSavings30, float *fFood, float *fTrans, float *fHealth, float *fHouse,
					float *fLeisure, float *fEduc, float *fFoodB, float *fTransB, float *fHealthB, 
					float *fHouseB, float *fLeisureB, float *fEducB, char *cInput)
{
	char cInput2;
	do {
		printf("[A] End the Day\n");
		printf("[B] End the Month\n");
		printf("[X] Back to Budgeting\n");
		printf("Enter corresponding letter to access option: ");
		scanf(" %c", &cInput2);
		switch (cInput2)
			{
			case 'a': case 'A':
			{
			endDay(fAllowance, fBalance, fExpenses, fSavings30, fFood, fTrans, fHealth,
				fHouse, fLeisure, fEduc, fFoodB, fTransB, fHealthB, fHouseB, fLeisureB,
				fEducB, nDay, nMonth);
			int nMonthCheck = (*nDay % 30) * (*nDay > 1);
			if (*fBalance >= 0)
			{
			if (nMonthCheck == 1)
				allocBudget(fAllowance, fFoodB, fTransB, fHealthB, fHouseB, fLeisureB, fEducB, cInput);
			}
			else
			{
				cInput2 = 'x';
			}
			} break;
			case 'b': case 'B':
			{
			endMonth (fBalance, fExpenses, fFood, nDay, nMonth);
			} break;
			case 'x': case 'X':
			break;
			default:
			{
				printf("Invalid Input.\n\n");	
			}
			}
	} while (cInput2!='A' && cInput2!='a' && cInput2!='B' && cInput2!='b' && cInput2!='X' && cInput2!='x');	
}

/* This function starts the first day for the program and includes all options of
   adding expenses, adding and using savings, ending the day or month, and even
   updating your budget allocation. 
   This function also displays your budget report after ending each month.
   Precondition: *fFoodB must be at least 300, while *fHouseB must be at least 4000.
   				 The remaining variables must have non-negative values.
   @param *fAllowance is the monthly allowance of the user.
   @param *fBalance is the amount of money the user has after expenses.
   @param *fExpenses is the total amount of expenses the user has in each category.
   @param *fSavings is the total amount of savings.
   @param *fSavings30 is the amount of savings the user has in the current month.
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
void startBudget (float *fAllowance, float *fBalance, float *fExpenses, float *fSavings, float *fSavings30,
			 int *nDay, int *nMonth, float *fFoodB, float *fTransB, float *fHealthB, float *fHouseB, float *fLeisureB, 
			 float *fEducB, float *fFood, float *fTrans, float *fHealth, float *fHouse, float *fLeisure, float *fEduc)
{
	char cOkay, cInput;
	int nDay30, nInput, nMonthCheck;
	float fAddSavings, fUseSavings, fExpenses30, fAddExpenses;
	
	do {		
	displayDivider();
	if ((*nMonth % 10) == 1 && (*nMonth < 11 || *nMonth > 13))
		printf("%dst Month\n", *nMonth);
	else if ((*nMonth % 10) == 2 && (*nMonth < 11 || *nMonth > 13))
		printf("%dnd Month\n", *nMonth);
	else if ((*nMonth % 10) == 3 && (*nMonth < 11 || *nMonth > 13))
		printf("%drd Month\n", *nMonth);
	else 
		printf("%dth Month\n", *nMonth);
	printf("Day Number %d\n\n", *nDay);
	printf("Balance: %.2f\n", *fBalance);
	printf("Total Savings: %.2f\n", *fSavings);
	printf("Current Month's Savings: %.2f\n", *fSavings30);
	printf("Current Month's Expenses: %.2f", *fExpenses);
	
	displayDivider ();
	printf("\n[A] Add Expenses\n");
	printf("[B] Add Savings\n");
	printf("[C] Use Savings\n");
	printf("[D] End the Day/Month\n");
	printf("[E] How Am I Doing?\n");
	printf("[X] Back to Main Menu\n");
	printf("\nEnter corresponding letter to access option: ");
	scanf(" %c", &cInput);
	
	switch (cInput)
	{
	case 'a':
	case 'A':
		{
		allocExpense(fBalance, fExpenses, &fAddExpenses, fFood, fTrans, fHealth, fHouse, fLeisure, fEduc);
		*fBalance = *fBalance - fAddExpenses;
		displayDivider();
		printf("Remaining Balance:        %10.2f\n", *fBalance);
		printf("Total Expenses:           %10.2f", *fExpenses);
		displayDivider();
		printf("Press any key to continue. ");
		scanf(" %c", &cOkay);
		}
	break;
	case 'b':
	case 'B':
		{
		addSavings (fBalance, fSavings, fSavings30);
		}
	break;
	case 'c':
	case 'C':
		{
		useSavings(&fUseSavings, fSavings, fSavings30);
		*fBalance = *fBalance + fUseSavings;
		}
	break;
	case 'd':
	case 'D':
		{	
		endDayMonthMenu(fAllowance, fBalance, fExpenses, nDay, nMonth, fSavings30,
						fFood, fTrans, fHealth, fHouse, fLeisure, fEduc,
						fFoodB, fTransB, fHealthB, fHouseB, fLeisureB, fEducB, &cInput);
		}
	break;
	case 'e':
	case 'E':
		{
		displayStats(fBalance, fFood, fTrans, fHealth, fHouse, 
				fLeisure, fEduc, fFoodB, fTransB, 
				fHealthB, fHouseB, fLeisureB, fEducB);
			printf("\nPress any key to continue. ");
			scanf(" %c", &cOkay);	
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
	
	if (*fBalance < 0)
		cInput = 'x';
		
	} while (cInput != 'x' && cInput != 'X');
	*nDay = *nDay, *fBalance = *fBalance, *fExpenses = *fExpenses, *fSavings = *fSavings, *fSavings30 = *fSavings30;
	*fFood = *fFood, *fTrans = *fTrans, *fHealth = *fHealth, *fHouse = *fHouse, *fLeisure = *fLeisure, *fEduc = *fEduc;
	*fFoodB = *fFoodB, *fTransB = *fTransB, *fHealthB = *fHealthB, *fHouseB = *fHouseB, *fLeisureB = *fLeisureB, *fEducB = *fEducB;
}

int main()
{
	float fAllowance = 0;
	int nInput = 0, nDay = 1, nMonth = 1;
	int nTime = 1, nTimeB = 1;
	float fFood=0, fTrans=0, fHealth=0, fHouse=0, fLeisure=0, fEduc=0;
	float fFoodB=300, fTransB=0, fHealthB=0, fHouseB=4000, fLeisureB=0, fEducB=0;
	float fBalance = 0, fExpenses, fSavings, fSavings30;
	char cInput;
	
	displayTitle();
	
	do {
	displayDivider();
	printf("\nM A I N   M E N U\n");
	printf("\n[1] Enter/Edit Your Allowance :>\n");
	printf("[2] Allocate Your Budget :3\n");
	printf("[3] A L L O W I T <3\n");
	printf("[4] Reset Your Run :(\n");
	printf("[0] Exit >:(\n");
	printf("\nEnter corresponding number to access option: ");
	scanf("%d", &nInput);
	
	switch (nInput)
	{
		case 0:
		{
			printf("\n[1] YES [0] NO\n");
			printf("Are you sure you want to exit AllowIt? ");
			scanf("%d", &nInput);
				if (nInput == 1)
				{
					nInput = 0;
				}
		}
		break;
		case 1:
		{
			getAllowance(&fAllowance, &cInput);
			if (fAllowance > 0)
			{
				if(nTime == 1)
				{
				fBalance = fAllowance;
				nTime++;
				}
			}
		}
		break;
		case 2:
		{
			if (fAllowance < 13000)
			getAllowance(&fAllowance, &cInput);
			if (cInput == '1')
			{
				if (fAllowance > 0)
				{
					if(nTime == 1)
					{
					fBalance = fAllowance;
					nTime++;
					}
				}
			}
			else
			nTime = 1;
			
			if (fAllowance > 0)
			{
			allocBudget(&fBalance, &fFoodB, &fTransB, &fHealthB,
					&fHouseB, &fLeisureB, &fEducB, &cInput);
			if (cInput == '1')
			nTimeB++;
			else 
			nTimeB = 1;
			}	
		}
		break;
		case 3:
		{
			if (fAllowance < 13000)
			getAllowance(&fAllowance, &cInput);
			if (cInput == '1')
			{
				if (fAllowance > 0)
				{
					if(nTime == 1)
					{
					fBalance = fAllowance;
					nTime++;
					}
				}
			}
			else
				nTime = 1;
				
			if (nTimeB == 1)
			{
				if (fAllowance > 0)
				{
					allocBudget(&fBalance, &fFoodB, &fTransB, &fHealthB,
						&fHouseB, &fLeisureB, &fEducB, &cInput);
					if (cInput == '1')
					nTimeB++;
					else
					nTimeB = 1;
				}
			}
			
			if (fAllowance > 0)
			{
			startBudget(&fAllowance, &fBalance, &fExpenses, &fSavings, 
					&fSavings30, &nDay, &nMonth,  &fFoodB, &fTransB,
					&fHealthB, &fHouseB, &fLeisureB, &fEducB, &fFood,
					&fTrans, &fHealth, &fHouse, &fLeisure, &fEduc);
			} 
		}
		break;
		case 4:
		{
			printf("\n[1] YES [0] NO\n");
			printf("Are you sure you want to reset your run? ");
			scanf("%d", &nInput);
			if (nInput == 1)
			{
				fFood=0, fTrans=0, fHealth=0, fHouse=0, fLeisure=0, fEduc=0;
				fFoodB=300, fTransB=0, fHealthB=0, fHouseB=4000, fLeisureB=0, fEducB=0;
				nDay = 1, nMonth = 1;
				fBalance = 0, fExpenses = 0, fSavings = 0, fSavings30 = 0;
				fAllowance = 0, nTime = 1, nTimeB = 1;
			}
			else
			nInput = 1;
		}
		break;
		default:
		{
				printf("\nInvalid Input!");
				nInput = 1;
		}
	}
	
	if (fBalance < 0)
	{
		printf("\n");
		displayDivider();
		printf("!ALERT!\n!YOU ARE BROKE!");
		nInput = 0;
	}
	} while (nInput != 0);
	return 0;
}
