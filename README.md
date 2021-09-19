# WordCounter
Java program with GUI for user to copy & paste or directly type text and get its word frequencies
This program was written in 2017 and is being uploaded in 2021 for my personal records

### Interface in Initial Startup:
![image](https://user-images.githubusercontent.com/15698935/133910928-e34fe099-2530-4b09-a799-d0137d33875c.png)

### This can output:
  - Alphabetized list of words and their frequencies
  - List of words and their frequencies sorted by frequency (and then alphabetically)
  - Alphabetized list of words (no freqency)
  - List of words sorted by frequency (no frequency)
  - Overall word count
  - Unique word count

### Buttons in Interface:
Alphabetize             - Orders words alphabetically and prints them & their frequencies to the Output Field.\n
Order by Occurance      - Orders words by # of occurances, organizing ties alphabetically, and prints them & their frequencies to the Output Field. Ordering by occurance sorts the numbers alphabetically (ie like: 1,10,11,12,2,3,4,5,6,7,8,9) instead of by value.\n
Clear Field             - Clears the Text Input field.\n
Copy to Clipboard       - Copies text in the format of "word1: freq1; word2: freq2; \[...\]; wordN: freqN;" to your clipboard so you can paste elsewhere. Order is as shown in the Output Field.\n
Copy Words to ClipBoard - Copies text in the format of "word1 word2 \[...\] wordN" to your clipboard so you can paste elsewhere. Order is as shown in the Output Field.\n

### Fields in Interface:
Text Input                - Top Left. Can right click to paste or manually type in text. Right clicking in here brings up a menu to cut, copy, paste, and select all. Undo on the right click menu functions for 'cut'.\n
Text Processing Buttons   - Top Right. All 3 buttons are defined above (see "Buttons in Interface").\n
Output Field              - Middle. Output text is printed here upon pressing Alphabetize or Order by Occurance. No direct interactive functionality enabled.\n
Copy Options Buttons      - Lower Middle. Allows copying of text printed in Output Field.\n
Word Count Total & Unique - Lower Left. Displays the number of unique words and number of total words represented in the Output Field.\n

![image](https://user-images.githubusercontent.com/15698935/133911859-ccdc72af-28f1-4bdc-b260-4caa356378fa.png)

### Limitations:
  - Not optimized to handle large amounts of input text.
  - Only handles A-Z;a-z characters.
  - Characters outside of this range will be deleted.
  - If multiple spaces happen in a row after the aforementioned deletion, each extra one will be counted as a word
  - Accented letters will be ignored (ie "çava" will be recognized as "ava").
  - Will not automatically categorized misspelled words with the properly spelled word.
  - Ordering by frequencies sorts frequency integers alphabetically instead of by value.
  - And probably more. I wrote this during a 3-hr lab period as a tool for my group to use in a psych research class when access to our original tool got denied.

### Example:

![This is an example sentence to demonstrate how this program operates. Text typed in here will persist unless manually cleared, either by hitting the clear field button to the right, deleting via keyboard, using the cut functionality from the right click menu, or by closing the window.This text input field does not automatically adjust if the entirety of the word cannot fit on the line. Words too long to display on the remainder of a line will print the rest of the word on the new line
However, if the text cannot be fully displayed in this or the Output Field, a scroll bar will appear on the right.->](https://user-images.githubusercontent.com/15698935/133912180-6e22c792-9b55-49ab-bd55-b76c00843207.png)

![image](https://user-images.githubusercontent.com/15698935/133912191-a5e96bd3-399c-40ee-8a35-cf3fa5d5e704.png)

![image](https://user-images.githubusercontent.com/15698935/133912201-d0be78ae-2544-4e24-8878-417c4749ca0c.png)

![image](https://user-images.githubusercontent.com/15698935/133912215-800441a4-7487-45f7-8503-8384367a4c5a.png)



