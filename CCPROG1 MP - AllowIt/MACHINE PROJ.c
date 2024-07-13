// ROIMARC BILBAO - BSCS-ST - CCPROG1 - S20A 
// BUDGETING SYSTEM MACHINE PROJECT

#include <stdio.h>


void displayTitle ()
{
	printf("%s\n", "  ___  _ _             _____ _ ");
	printf("%s\n", " / _ \\| | |           |_   _| |  ");
	printf("%s\n", "/ /_\\ \\ | | _____      _| | | |_");
	printf("%s\n", "|  _  | | |/ _ \\ \\ /\\ / / | | __|");
	printf("%s\n", "| | | | | | (_) \\ V  V /| |_| |_ ");
	printf("%s\n\n\n", "\\_| |_/_|_|\\___/ \\_/\\_/\\___/\\\\__|");
}
void displayDivider ()
{
	printf("\n%s%s%s%s\n","----------", "----------", "----------", "----------");
}

void getAllowance ()
{
	float fAllowance;
	printf("Monthly Allowance:\nHow much money do you acquire every month?  ");
	scanf("%f", &fAllowance);
	
	if (*Allowance >= 13000.00)
	{ 
		chooseNecessity();
	} else
	{
		printf("\n!MONTHLY ALLOWANCE MUST BE AT LEAST 13000!\n\n");
		getAllowance ();
	}
                     
}

void chooseNecessity ()
{
		int nNecessity;
		printf("\nNecessity Categories:\n");
		printf("1. Food and Drink\n2. Transportation\n");
		printf("3. Healthcare\n4. Housing and Utilities\n");
		printf("5. Leisure Activities\n6. Education\n\n");
		printf("Select your desired category:  ");
		scanf("%d", &nNecessity);
	allocBudget (&nNecessity);
}
	

void allocBudget (int *necess)
{
	float fFood, fTranspo, fHealth, fHouse, fLeisure, fEduc, fAllowance;
	
	switch (*necess)
	{
	case 1:
		printf("Allot your budget for Food and Drinks:  ");
		scanf("%f", &fFood);
		if (fFood < 300)
		{
			printf("!MINIMUM ALLOCATION FOR FOOD AND DRINKS IS 300!");
			chooseNecessity (fAllowance);
		}
		else 
		{
			confirmAlloc1 (&fFood, &fTranspo, &fHealth, &fHouse, &fLeisure, &fEduc);
		}
	break;
	case 2:
		printf("Allot your budget for Transportation:  ");
		scanf("%f", &fTranspo);
		confirmAlloc1 (&fFood, &fTranspo, &fHealth, &fHouse, &fLeisure, &fEduc);
	break;
	case 3:
		printf("Allot your budget for Healthcare:  ");
		scanf("%f", &fHealth);
		confirmAlloc1 (&fFood, &fTranspo, &fHealth, &fHouse, &fLeisure, &fEduc);
	break;
	case 4:
		printf("Allot your budget for Housing and Utilities:  ");
		scanf("%f", &fHouse);
		if (fHouse < 4000)
		{
			printf("!MINIMUM ALLOCATION FOR HOUSING AND UTILITIES MUST BE 4000!");
			chooseNecessity (fAllowance);
		}
		else 
		{
			confirmAlloc1 (&fFood, &fTranspo, &fHealth, &fHouse, &fLeisure, &fEduc);
		}
	break;
	case 5:
		printf("Allot your budget for Leisure Activities:  ");
		scanf("%f", &fLeisure);
		confirmAlloc1 (&fFood, &fTranspo, &fHealth, &fHouse, &fLeisure, &fEduc);
	break;
	case 6:
		printf("Allot your budget for Education:  ");
		scanf("%f", &fEduc);
		confirmAlloc1 (&fFood, &fTranspo, &fHealth, &fHouse, &fLeisure, &fEduc);
	break;
}
}


void computeSavings (float *TotalAlloc)
{
	float fSavings = fAllowance - *TotalAlloc;
	printf("Savings:               %.2f\n", fSavings);
}

void confirmAlloc1 (float *Food, float *Transpo, float *Health, float *House, float *Leisure, float *Educ, float *Allowance)
	{
		int nConfirm1;
		float fTotalAlloc = *Food + *Transpo + *Health + *House + *Leisure + *Educ;
		printf("Food and Drinks:       %.2f\n", *Food);
		printf("Transportation:        %.2f\n", *Transpo);
		printf("Healthcare:            %.2f\n", *Health);
		printf("Housing and Utilities: %.2f\n", *House);
		printf("Leisure Activities:    %.2f\n", *Leisure);
		printf("Education:             %.2f\n", *Educ);
		displayDivider ();
		printf("Total Spendings:       %.2f\n", fTotalAlloc);
		computeSavings (&fTotalAlloc);
		printf("1 = YES  0 = NO\n Do You Confirm Your Allocation?  ");
		scanf("%d", &nConfirm1);
			if (nConfirm1 > 0)
			{
				chooseNecessity ();
			}
	}

int main ()			
{
	displayTitle ();
	getAllowance ();
	return 0; 	
}