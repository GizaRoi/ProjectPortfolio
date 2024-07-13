/*********************************************************************************************************
This is to certify that this project is my own work, based on my personal efforts in studying and applying the concepts
learned. I have constructed the functions and their respective algorithms and corresponding code by myself. The
program was run, tested, and debugged by my own efforts. I further certify that I have not copied in part or whole or
otherwise plagiarized the work of other students and/or persons.
																	Roimarc Furagganan Bilbao, 12203394
*********************************************************************************************************/

#include <stdio.h>
#include <string.h>
#include <conio.h>
#include <stdlib.h>
#include <time.h>
#define S20 21
#define S30 31
#define S150 151
#define SFILE 27
#define SIZE 20

typedef char String20[21];
typedef char String30[31];
typedef char String150[151];

struct quizRecord
{
	String20 Topic;
	String150 Ques;
	String30 Cho1;
	String30 Cho2;
	String30 Cho3;
	String30 Ans;
};
typedef struct quizRecord quizRecord;

/* getString gets user input and assigns each character into the character array (string).
	@param string[] - character array that can also allot spaces except line feeds ('\n')
	@param nSize - non-negative integer containing the value of the size of the string
*/
void 
getString(char string[], 
			int nSize)
{
	int i = 0;
	char ch;

	do{
		if (i == 0)
			scanf(" %c", &ch);
		else
			scanf("%c", &ch);
		if (ch != '\n')
		{
			string[i] = ch;
			i++;
			string[i] = '\0';
		}
	} while ((ch != '\n') && i < nSize);
}

/* getPassword gets user input for a string but only prints out asterisks (*).
	@param password - the string that will store user input
*/
void 
getPassword(String30 password)
{
	int i = 0;
	char ch;

	do{
		ch = getch();
		if (ch != '\r')
		{
			if (ch == '\b')
			{
				if (i > 0)
				{
					password[i - 1] = '\0';
					printf("\b \b");
					i = i - 1;
				}
			}
			else
			{
				password[i] = ch;
				printf("*");
				i++;
				password[i] = '\0';
			}
		}
	} while (ch != '\r' && i < S30);
}

/* regPassword takes 2 strings for getting and confirming the password.
	@param password - the string that will store the final password
*/
void 
regPassword(String30 password)
{
	String30 tempPassword, confPassword;
	int nExit = 0;

	printf("\n ~ ~ PASSWORD REGISTRATION ~ ~ \n");

	do {
		printf("\nRegister your Password: ");
		getPassword(tempPassword);
		printf("\nConfirm your Password: ");
		getPassword(confPassword);
		if (tempPassword == '\0' && confPassword == '\0')
			nExit = 1;
		if (strcmp(tempPassword,confPassword) != 0)
			printf("\n\n!PASSWORDS DO NOT MATCH!\n");
	} while (strcmp(tempPassword,confPassword) != 0 && !nExit);

	if (nExit == 0)
	{
		printf("\n\nRegistration Complete.\n");
		strcpy(password, tempPassword);
	}
}

/* passwordSequence combines regPassword and getPassword for implementation.
	@param password - the string that will store the official password
	@param *isCorrect - confirms the validity of the entered password
*/
void 
passwordSequence(String30 password, 
					int *isCorrect)
{
	String30 tempPassword;
	if (strlen(password) == 0)
		regPassword(password);
	printf("\nEnter your Password: ");
	getPassword(tempPassword);
	if (strcmp(tempPassword, password) == 0)
		*isCorrect = 1;
	else
		*isCorrect = 0;
}

/*displayRecord displays the contents of a specific record
	@param record - contains the struct array of quiz questions
	@param nIndex - integer that dictates what record will be displayed
*/
void 
displayRecord(quizRecord record[],
					 int nIndex)
{
	printf("\n");
	printf("\nTopic:       %s", record[nIndex].Topic);
	printf("\nQuestion:    %s", record[nIndex].Ques);
	printf("\nChoice 1:    %s", record[nIndex].Cho1);
	printf("\nChoice 2:    %s", record[nIndex].Cho2);
	printf("\nChoice 3:    %s", record[nIndex].Cho3);
	printf("\nAnswer:      %s\n", record[nIndex].Ans);
}

/* displayNumberedRecord displays the contents of a specific record with number guides
	@param record - struct array that contains all quiz questions and data
	@param nIndex - integer that dictates what record will be displayed
*/
void 
displayNumberedRecord(quizRecord record[], 
							int nIndex)
{
	printf("\n");
	printf("\n[1] Topic:     %s", record[nIndex].Topic);
	printf("\n[2] Question:  %s", record[nIndex].Ques);
	printf("\n[3] Choice 1:  %s", record[nIndex].Cho1);
	printf("\n[4] Choice 2:  %s", record[nIndex].Cho2);
	printf("\n[5] Choice 3:  %s", record[nIndex].Cho3);
	printf("\n[6] Answer:    %s\n", record[nIndex].Ans);
}

/* flushRecord takes a certain struct of quizRecord and deletes all data inside it
	@param record - the struct array of quizRecord that gets to be cleared of data
	@param nRecordSize - integer that counts how many quiz records there are
*/
void
flushRecord (quizRecord record[],
					 int nRecordSize)
{
	int i;
	quizRecord emptyRecord;

	for(i = 0; i < nRecordSize; i++)
		record[i] = emptyRecord;
}

/* getQues gets all the records that have the same topic
	@param record - the struct array that contains all 
	@param dest - the struct array where the records with the same topic will be put into
	@param Topic - string that contains the topic where the function will get the records from
	@param nRecordSize - integer that counts how many quiz records there are
	@param nQues - counts how many questions were put onto the destination struct array
*/
void 
getQues(quizRecord record[],
			quizRecord dest[], 
			String20 Topic, 
			int *nRecordSize, 
			int *nQues)
{
	int i, j = 0;
	int nDupe;

	for (i = 0; i < (*nRecordSize); i++)
	{
		nDupe = strcmp(record[i].Topic, Topic);
		if (nDupe == 0)
		{
			dest[j] = record[i];
			j++;
		}
	}
	(*nQues) = j;
}

/* checkDupe checks if the record that is yet to be added has the same question or answer from all the existing records
	@param record - struct array that contains all quiz records
	@param Ques - string that has the question to be compared
	@param Ans - string that has the answer to be compared
	@param nDupe - integer that tells if there is a duplicate or not
	@param nRecordSize - integer that counts how many quiz records there are
	@param nIndex - integer that tells which index is the duplicate, if there is
*/
void 
checkDupe(quizRecord record[], 
			String150 Ques, 
			String30 Ans, 
			int *nDupe, 
			int *nRecordSize, 
			int *nIndex)
{
	int i = 0;
	int nQuesCheck = 1;
	int nAnsCheck = 1;
	*nDupe = 0;

	for (i = 0; i < *nRecordSize && !(*nDupe); i++)
	{
		nQuesCheck = strcmp(record[i].Ques, Ques);
		nAnsCheck = strcmp(record[i].Ans, Ans);
		if (nQuesCheck == 0 || nAnsCheck == 0)
			(*nDupe) = 1;
	}

	*nIndex = i - 1;
}


/*	addRecord adds a record using user input and puts it into the quizData struct.
	@param record[] - the record that will contain the user input
	@param nRecordSize - integer that counts how many records there are
*/
void 
addRecord(quizRecord record[], 
			int *nRecordSize)
{
	int i, j;
	int nDupe = 0;
	int nIndex = 0;
	int nQues;
	String150 Ques;
	String30 Ans;
	quizRecord quesRecord[SIZE];


	printf("\n~ ~ Add Record ~ ~");
	printf("\n\nEnter your Question: ");
	getString(Ques, S150);
	
	printf("\nEnter your Answer: ");
	getString(Ans, S30);

	checkDupe(record, Ques, Ans, &nDupe, nRecordSize, &nIndex);
	if (nDupe == 1)
	{
		printf("\n\nRecord has already been listed.\n");
		displayRecord(record, nIndex);
	}
	else
	{
		printf("\n\nQuestion: %s", Ques);
		printf("\n\nAnswer: %s", Ans);

		printf("\n\nEnter the Topic: ");
		getString(record[*nRecordSize].Topic, S20);

		strcpy(record[*nRecordSize].Ques, Ques);
		strcpy(record[*nRecordSize].Ans, Ans);

		printf("\nEnter Choice 1: ");
		getString(record[*nRecordSize].Cho1, S30);

		printf("\nEnter Choice 2: ");
		getString(record[*nRecordSize].Cho2, S30);

		printf("\nEnter Choice 3: ");
		getString(record[*nRecordSize].Cho3, S30);

		(*nRecordSize)++;
	}
}

/* getTopics will get all the UNIQUE topics from the main record
	@param record - struct array that contains all quiz records
	@param dest - struct array where all unique topics will be put into
	@param nRecordSize - integer that counts how many quiz records are from the main record
	@param nTopic - integers that tells how many unique topics there are from the main record
*/
void 
getTopics(quizRecord record[], 
			quizRecord dest[], 
			int *nRecordSize, 
			int *nTopic)
{
	int i, j = 0, k = 0;
	int nDupe;
	int isGot = 0;

	for(i = 0; i < *nRecordSize; i++)
	{
		isGot = 0;
		for(j = 0; j < k + 1 && isGot == 0; j++)
		{
			nDupe = strcmp(record[i].Topic, dest[j].Topic);
			if(nDupe == 0)
				isGot = 1;
		}
		if(nDupe != 0)
		{
			dest[k] = record[i];
			k++;
		}
	}

	*nTopic = k;
}

/* displayTopics displays all the unique topics from the main record
	@param record - struct array that contains all quiz records; the main record array
	@param dest - the struct array that contains records with each unique topic
	@param nRecordSize - integer that counts how many records there are from the main record array
	@param nTopic - integer that counts how many unique topics there are
*/
void 
displayTopics(quizRecord record[], 
				quizRecord dest[],
				int *nRecordSize, 
				int *nTopic)
{
	int i;

	getTopics(record, dest, nRecordSize, nTopic);

	printf("\nTopics:\n");
	for(i = 0; i < *nTopic; i++)
		printf("%d. %s\n", i + 1, dest[i].Topic);
}

/*displayQuestions displays all questions that are from one topic
	@param record - main record array that contains all records
	@param dest - record array that contains all records that have the same topic
	@param Topic - string that contains the topic that was compared from the main record array
	@param nQues - counts how many questions there are
	@param nRecorSize - integer that counts how many records there are in the main record array
*/
void 
displayQuestions(quizRecord record[], 
				quizRecord dest[],
				String20 Topic,
				int *nQues, 
				int *nRecordSize)
{
	int i;

	getQues(record, dest, Topic, nRecordSize, nQues);

	printf("\nQuestions for the topic of %s:\n", Topic);
	for (i = 0; i < *nQues; i++)
		printf("%d. %s\n", i + 1, dest[i].Ques);

	*nQues = i;
}

/* editRecordComponent lets the user pick a certain component of the record and lets them edit it
	@param record - gets the certain record from the main record array that will be edited
	@param nInput - dictates what component will be edited
	@param nRecordSize - counts how many records there are in the main record array
*/
void 
editRecordComponent(quizRecord *record, 
					int nInput, 
					int *nRecordSize)
{
	String150 Ques;
	String30 Ans;
	int nDupe, nIndex;
	int nQues;
	quizRecord quesRecord[SIZE];

	strcpy(Ques, ""); strcpy (Ans, "");
	flushRecord(quesRecord, *nRecordSize);

	switch(nInput)
	{
		case 1:
			printf("\nEnter your Topic: ");
			getString(record->Topic, S20);
		break;
		case 2:
			printf("\nEnter your Question: ");
			getString(Ques, S150);
			checkDupe(record, Ques, Ans, &nDupe, nRecordSize, &nIndex);
			if(nDupe == 1)
				printf("Invalid Input.\n");
			else
				strcpy(record->Ques, Ques);
		break;
		case 3:
			printf("\nEnter Choice 1: ");
			getString(record->Cho1, S30);
		break;
		case 4:
			printf("\nEnter Choice 2: ");
			getString(record->Cho2, S30);
		break;
		case 5:
			printf("\nEnter Choice 3: ");
			getString(record->Cho3, S30);
		break;
		case 6:
			printf("\nEnter your Answer: ");
			getString(Ans, S30);
			checkDupe(record, Ques, Ans, &nDupe, nRecordSize, &nIndex);
			if(nDupe == 1)
				printf("Invalid Input.\n");
			else
				strcpy(record->Ans, Ans);
		break;
		default:
			printf("\n!INVALID INPUT!");
	}
}


/* editRecord is the part of the manage data menu that lets the admin edit the records
	@param record - the main record array that contains all records
	@param nRecordSize - integer that counts how many records there are from the main record array
*/
void 
editRecord (quizRecord record[], 
			int *nRecordSize)
{
	int i, j, isFound = 0;
	int nTopic;
	int nInput;
	int nQues;
	int nDupe;
	quizRecord topicRecord[SIZE];
	quizRecord quesRecord[SIZE];
	quizRecord editRecord;

	flushRecord(topicRecord, *nRecordSize);
	flushRecord(quesRecord, *nRecordSize);

	printf("\n ~ ~ Edit Record ~ ~");

	do {
		displayTopics(record, topicRecord, nRecordSize, &nTopic);

		printf("\n[0] BACK TO MANAGE DATA");
		printf("\nEnter your desired topic number: ");
		scanf("%d", &nInput);
		nInput--;

		if (nInput > nTopic || nInput < -1)
			printf("\n!INVALID INPUT!");
		else if (nInput == -1)
		{}
		else
		{
			displayQuestions(record, quesRecord, topicRecord[nInput].Topic, &nQues, nRecordSize);

			printf("\nEnter your desired question number: ");
			scanf("%d", &nInput);
			nInput--;
			if (nInput + 1 > nQues)
				printf("\n!INVALID INPUT!");
			else
			{
				i = 0;
				do {
					if(strcmp(record[i].Ques, quesRecord[nInput].Ques) == 0)
						isFound = 1;
					else
						i++;
				} while(isFound != 1 && i < *nRecordSize);

				nInput = i;
					
				displayNumberedRecord(record, nInput);
				printf("\nEnter component: ");
				scanf("%d", &nInput);

				editRecord = record[i];
				editRecordComponent(&editRecord, nInput, nRecordSize);
				record[i] = editRecord;
				displayRecord(record, i);
			}
		}
	} while(nInput != -1 && (nInput > nTopic || nInput < -1 || nQues > *nRecordSize));
}

/* deleteRecord deletes a certain record from the main record array
	@param record - main record array that contains all records
	@param nRecordSize - integet that counts how many records there are from the main record array
*/
void 
deleteRecord (quizRecord record[], 
			int *nRecordSize)
{
	int i, j, k, l, isFound = 0;
	int nTopic;
	int nQues;
	int nInput;
	char cInput;
	quizRecord emptyRecord;
	quizRecord topicRecord[SIZE];
	quizRecord quesRecord[SIZE];

	flushRecord(topicRecord, *nRecordSize);
	flushRecord(quesRecord, *nRecordSize);

	printf("\n ~ ~ Delete Record ~ ~");

	do {
		l = 1;
		displayTopics(record, topicRecord, nRecordSize, &nTopic);

		printf("\n[0] BACK TO MANAGE DATA");
		printf("\nEnter your desired topic number: ");
		scanf("%d", &nInput);
		nInput--;

		if (nInput > nTopic || nInput < -1)
			printf("\n!INVALID INPUT!");
		else if (nInput == -1)
		{}
		else
		{
			displayQuestions(record, quesRecord, topicRecord[nInput].Topic, &nQues, nRecordSize);

			printf("\nEnter your desired question number: ");
			scanf("%d", &nInput);
			nInput--;
			if (nInput + 1 > nQues)
				printf("\n!INVALID INPUT!");
			else
			{
				i = 0;
				do {
					if(strcmp(record[i].Ques, quesRecord[nInput].Ques) == 0)
						isFound = 1;
					else
						i++;
				} while(isFound != 1 && i < *nRecordSize);

				nInput = i;
					
				displayRecord(record, nInput);
				printf("\n[Y] YES [ANY] NO\n");
				printf("Are you sure you want to delete this record? ");
				scanf(" %c", &cInput);

				if (cInput == 'Y' || cInput == 'y')
				{
					for(i = nInput; i < *nRecordSize; i++)
					{
						record[i] = record[i+1];
					}

					(*nRecordSize)--;
				}	
			}
			flushRecord(topicRecord, *nRecordSize);
		}
	} while(nInput != -1 && (nInput > nTopic || nInput < -1 || nQues > *nRecordSize));
}

/* readString is a function that properly gets a string from a file
	@param fp - this is the file pointer where the function will scan from
	@param string - this is where the scanned data from the file will be assigned to
	@param nSize - integer that corresponds to the size of the character array
*/
void 
readString(FILE *fp, 
			char string[], 
			int nSize, 
			int *nNotEmpty)
{
	int i = 0, nStop;
	char ch;

	do {	
		nStop = fscanf(fp, "%c", &ch);
		if (ch == '\n' || i >= nSize)
		{
			nStop = 0;
		}
		else if (nStop == -1)
		{
			*nNotEmpty = 0;
		}
		else
		{
			string[i] = ch;
			i++;
			string[i] = '\0';
		}
	} while (nStop == 1);
}

/* readRecord is the function that reads a file and puts all strings to their appropriate record components
	@param imp - file pointer that holds the file to be read
	@param record - the record that will hold the data read from the file
	@param nNotEmpty - 
*/
void 
readRecord(FILE *imp, 
		quizRecord *record, 
		int *nNotEmpty)
{
	char ch[2];

	readString(imp, record->Topic, S20, nNotEmpty);
	if (*nNotEmpty == 1)
	{
		readString(imp, record->Ques, S150, nNotEmpty);
		readString(imp, record->Cho1, S30, nNotEmpty);
		readString(imp, record->Cho2, S30, nNotEmpty);
		readString(imp, record->Cho3, S30, nNotEmpty);
		readString(imp, record->Ans, S30, nNotEmpty);
	}
}

/* importRecord gets a file from user input and puts all of its data into the main record array
	@param record - the main record array that contains all records
	@param nRecordSize - counts how many records there are in the main record array
*/
void 
importRecord(quizRecord record[], 
			int *nRecordSize)
{
	FILE *imp;
	int i = 0, nNotEmpty = 1, nDupe = 0, nIndex;
	String30 filename;
	quizRecord temp;

	printf("\n ~ ~ Import Record ~ ~");
	
	do{
		printf("\n[0] GO BACK");
		printf("\nEnter file name: ");
		getString(filename, SFILE);

		strcat(filename, ".txt");

		imp = fopen(filename, "r");

		switch ((int)imp)
		{
		case 0:
			if(strcmp("0.txt", filename) != 0)
				printf("\nFile not found.\n");
			break;
		default:
			while (!feof(imp))
			{
				flushRecord(&temp, 1);
				if (nNotEmpty)
				{
					readRecord(imp, &temp, &nNotEmpty);

					checkDupe(record, temp.Ques, temp.Ans, &nDupe, nRecordSize, &nIndex);
					if (!nDupe)
					{
						record[*nRecordSize] = temp;
						(*nRecordSize)++;
					}
				}
				fscanf(imp, "%c");
			}
			(*nRecordSize)--;
			break;
		}
		fclose(imp);
	} while(!imp && strcmp(filename, "0.txt") != 0);
}

/* exportRecord puts all of the existing records from the main record array and exports it into a text file
	@param record - main record array that contains all records
	@param nRecord - integer that counts how many records there are
*/
void 
exportRecord(quizRecord record[], 
			int *nRecordSize)
{
	int i;
	FILE *exp;
	String30 filename;

	printf("\n ~ ~ Export Record ~ ~");

	printf("\n[0] GO BACK");
	printf("\nEnter file name: ");
	getString(filename, SFILE);
	strcat(filename, ".txt");

	if(strcmp(filename, "0.txt") != 0)
	{
		exp = fopen(filename, "w");
		for(i = 0; i < *nRecordSize; i++)
		{
			fprintf(exp, "%s\n", record[i].Topic);
			fprintf(exp, "%s\n", record[i].Ques);
			fprintf(exp, "%s\n", record[i].Cho1);
			fprintf(exp, "%s\n", record[i].Cho2);
			fprintf(exp, "%s\n", record[i].Cho3);
			fprintf(exp, "%s\n\n", record[i].Ans);
		}
		fclose(exp);
	}

}

/* manageData has all available options for manipulating data that will be used for the quiz game.
	@param password - the string that stores the official password
	@param record - the struct array that contains all records
	@oaram nRecordSize - integer that counts how many records there are
*/
void
manageData(String30 password, 
			quizRecord record[],
			int *nRecordSize)
{
	int isCorrect;
	char cInput;
	String150 Ques;
	String30 Ans;

	do {
		passwordSequence(password, &isCorrect);
		if (isCorrect != 1)
		{
			printf("\n\n!INCORRECT PASSWORD!\n");
			printf("[A] Try Again [ANY] Main Menu\n");
			printf("> ");
			scanf(" %c", &cInput);	
		} 
		} while ((cInput == 'a' || cInput == 'A') && isCorrect != 1); 
		
		if (isCorrect == 1)
		{
			do{
				printf("\n\n[A] Add Record\n");
				printf("[E] Edit Record\n");
				printf("[D] Delete Record\n");
				printf("[1] Import Record/s\n");
				printf("[2] Export Record/s\n");
				printf("[X] Exit\n");
				printf("> ");
				scanf(" %c", &cInput);
		
				switch(cInput)
				{
					case 'A': case 'a':
					{
						addRecord(record, nRecordSize);
					} break;
					case 'E': case 'e':
					{
						editRecord(record, nRecordSize);
					} break;
					case 'D': case 'd':
					{
						deleteRecord(record, nRecordSize);
					} break;
					case '1':
					{
						importRecord(record, nRecordSize);
					} break;
					case '2':
					{
						exportRecord(record, nRecordSize);
					} break;
					case 'q':
					{
						for(int i = 0; i < *nRecordSize; i++)
							displayRecord(record, i);
					} break;
				}
		} while (cInput != 'X' && cInput != 'x');
	}
}

/* startQuiz starts the quiz game entitled Midterms Simulator.
	@param record is the main record array that contains all records
	@param nRecordSize dictates how many records there are in the main record array
	@param playerName is a string that contains the player's name
	@param nScore is the integer that contains the accumulated points of the player
*/
void 
startQuiz(quizRecord record[],
			int *nRecordSize, 
			String30 playerName, 
			int *nScore)
{
	int nTopic = 0, nInput, nQues, nIndex;
	char cInput;
	String30 Ans;
	quizRecord topicRecord[SIZE];
	quizRecord quesRecord[SIZE];
	flushRecord(topicRecord, *nRecordSize);
	flushRecord(quesRecord, *nRecordSize);
	strcpy(playerName, "");

	if(*nRecordSize == 0)
	{
		printf("\n!!CANNOT PLAY QUIZ GAME!!\n");
		printf("Try manually adding records or importing a record file at the Manage Data Menu.");
	}
	else
	{
		printf("\n~ ~ MIDTERMS SIMULATOR ~ ~");
		printf("\n\nFrancis Bacon: Hello? I've been seeing you a lot around campus lately...");
		printf("\n What's your name nga pala? \n> ");
		
		do{
			getString(playerName, S30);

			if(strcmp(playerName, "\0") == 0)
			{
				printf("Francis Bacon: ");
			}
		} while (strlen(playerName) == 0);

		printf("\nFrancis Bacon: Oh ikaw pala si %s, nice to meet you!", playerName);
		printf("\nSo %s, have you made aral-aral na ba for the coming Midterms?");
		printf("\n\n%s: ...\n");
		printf("\nFrancis Bacon: SIYEMPRE HINDI!! LAHAT NAMAN US GAN'ON!!\n");
		printf("\nFrancis Bacon: Tara, let us make aral na! Anong topic ang gusto mong pag-aralan?");

		do {
			displayTopics(record, topicRecord, nRecordSize, &nTopic);

			printf("\n[0] GO BACK TO GAME MENU");
			printf("\nEnter your desired topic number: ");
			scanf("%d", &nInput);
			nInput--;

			if (nInput > nTopic || nInput < -1)
				printf("\n!INVALID INPUT!");
			else if (nInput == -1)
			{}
			else
			{
				getQues(record, quesRecord, topicRecord[nInput].Topic, nRecordSize, &nQues);
				do {
					srand(time(NULL));
					nIndex = rand() % nQues;
					printf("\nScore: %d\n", *nScore);
					printf("\nFrancis Bacon: %s", quesRecord[nIndex].Ques);
					printf("\nChoices:\n  %s\n  %s\n  %s", quesRecord[nIndex].Cho1, quesRecord[nIndex].Cho2, quesRecord[nIndex].Cho3);
					printf("\n\nAnswer: ");
					getString(Ans, S30);
					if (strcmp(Ans, quesRecord[nIndex].Ans) == 0)
					{
						(*nScore)++;
						switch (rand() % 3)
						{
						case 0:
							printf("\nFrancis Bacon: NICE ONE! GALING MO DUN PARECHONG!");
							break;
						case 1:
							printf("\nFrancis Bacon: SHEEEESH %s!", playerName);
							break;
						case 2:
							printf("\nFrancis Bacon: AMG DAMI MO NANG ALAM %s!", playerName);
							break;
						}
					}
					else
					{
						printf("\nFrancis Bacon: Ay mali ka dun %s, sige bawi na lang.", playerName);
					}
					printf("\n [ANY] YES [0] NO");
					printf("\nFrancis Bacon: Ano %s? Kaya pa ba? ", playerName);
					scanf(" %c", &cInput);

					if (cInput == '0')
					{
						printf("\n\nFrancis Bacon: Sige %s, kaya mo na iyan, naka %d ka naman sa reviewer ko. Goodluck sa Midterms!", playerName, *nScore);
					}
				} while (cInput != '0');
			}
		} while(nInput != -1 && (nInput > nTopic || nInput < -1 ));
	}
}


void
viewScore(FILE *score, String30 playerName, int nScore)
{
	int nScore2, i = 1, nNotEmpty;
	String30 playerName2;
	char ch;

	printf("\n~ ~ SCORES ~ ~\n");

	if (fscanf(score, "%c", &ch) != -1)
	{
		while(!feof(score))
		{
			strcpy(playerName2, "");
			readString(score, playerName2, S30, &nNotEmpty);
			fscanf(score, "%d", &nScore2);
			if(strlen(playerName2) != 0)
			{
				printf("%d. %s - %d\n", i, playerName2, nScore2);
				i++;
			}
		}
	}
}

/* playGame is where the actual quiz game resides.
*/
void 
playGame(quizRecord record[], 
			int *nRecordSize)
{
	String30 playerName;
	strcpy(playerName, "");
	int nScore = 0;
	char cInput;
	FILE *score;


	printf("\n~ ~ MIDTERMS SIMULATOR ~ ~");

	do {
		score = fopen("score.txt", "a+");
		printf("\n\n[G] Play\n");
		printf("[S] View Scores\n");
		printf("[X] Exit\n");
		printf("> ");
		scanf(" %c", &cInput);

		switch (cInput)
		{
		case 'G': case 'g':
			startQuiz(record, nRecordSize, playerName, &nScore);
			fprintf(score, "%s\n%d\n\n", playerName, nScore);
			fclose(score);
		break;
		case 'S': case 's':
			viewScore(score, playerName, nScore);
			fclose(score);
		break;
		}
	} while (cInput != 'X' && cInput != 'x');
}

/* mainMenu is what the user will see on start-up.
*/
void 
mainMenu(String30 password, 
		quizRecord record[], 
		int *nRecordSize)
{
	char cInput;
	
	do{
		printf("\n ~ ~ MAIN MENU ~ ~\n\n");
		printf("[D] Manage Data\n");
		printf("[G] Play\n");
		printf("[X] Exit\n");
		printf("> ");
		scanf(" %c", &cInput);
		
		switch(cInput)
		{
			case 'D':
			case 'd':
				manageData(password, record, nRecordSize);
			break;
			case 'G':
			case 'g':
				playGame(record, nRecordSize);
			break;
		}
	} while(cInput != 'X' && cInput != 'x');
}

int 
main()
{
	int nRecordSize = 0;
	String30 password = "\0";
	quizRecord record[SIZE];
	mainMenu(password, record, &nRecordSize);
	return 0;
}
