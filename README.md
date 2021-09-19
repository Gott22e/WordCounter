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
Alphabetize             - Orders words alphabetically and prints them & their frequencies to the Output Field
Order by Occurance      - Orders words by # of occurances, organizing ties alphabetically, and prints them & their frequencies to the Output Field. Ordering by occurance sorts the numbers alphabetically (ie like: 1,10,11,12,2,3,4,5,6,7,8,9) instead of by value.
Clear Field             - Clears the Text Input field
Copy to Clipboard       - Copies text in the format of "word1: freq1; word2: freq2; \[...\]; wordN: freqN;" to your clipboard so you can paste elsewhere. Order is as shown in the Output Field
Copy Words to ClipBoard - Copies text in the format of "word1 word2 \[...\] wordN" to your clipboard so you can paste elsewhere. Order is as shown in the Output Field

### Fields in Interface:
Text Input                - Top Left. Can right click to paste or manually type in text. Right clicking in here brings up a menu to cut, copy, paste, and select all. "Undo" on the right click menu is non-functional
Text Processing Buttons   - Top Right. All 3 buttons are defined above (see "Buttons in Interface")
Output Field              - Middle. Output text is printed here upon pressing Alphabetize or Order by Occurance. No direct interactive functionality enabled.
Copy Options Buttons      - Lower Middle. Allows copying of text printed in Output Field
Word Count Total & Unique - Lower Left. Displays the number of unique words and number of total words represented in the Output Field

![image](https://user-images.githubusercontent.com/15698935/133911859-ccdc72af-28f1-4bdc-b260-4caa356378fa.png)

### Limitations:
  - Not optimized to handle large amounts of input text
  - Only handles A-Z;a-z characters
  - Characters outside of this range will be deleted
  - If multiple spaces happen in a row after the aforementioned deletion, each extra one will be counted as a word
  - Accented letters will be ignored (ie "çava" will be recognized as "ava")
  - Will not automatically categorized misspelled words with the properly spelled word
  - Ordering by frequencies sorts frequency integers alphabetically instead of by value
  - And probably more. I wrote this during a 3-hr lab period as a tool for my group to use in a psych research class when access to our original tool got denied.
