This is a simple contact list management application that allows users to store and manage contact information.
The app enables users to add, remove, update, and search for contacts based on their mobile numbers or names. The contacts are stored in an in-memory array, with each contact represented as a string
in the format    `"Name,Mobile,Email"`.

## Key Features

1. **Add a Contact**: Users can add new contacts to the system, ensuring that no two contacts have the same mobile number. This prevents duplicate entries and maintains data integrity.
2. **Get All Contacts**: Users can retrieve all stored contacts. This feature is useful for displaying the entire contact list.
3. **Find Contacts by Name**: Users can search for contacts by name. The search is case-insensitive and returns all contacts that match the given name.
4. **Remove a Contact by Mobile Number**: Users can remove a contact from the system using the mobile number. This feature is useful for deleting outdated or incorrect contact information.
5. **Update Contact Information by Mobile Number**: Users can update the information of an existing contact by providing the mobile number and the new contact details. This feature ensures that users can keep their contact information up-to-date.

## Project Structure

The project follows a standard Maven directory