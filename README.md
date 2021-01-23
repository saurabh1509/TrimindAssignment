# TrimindAssignment
This assignment is to perform operation like auto generated id , perform REST API.
This application will allow addition of payment terms to the system. Payment terms are
used to derive the due date of an invoice.
We will be using a simplified model of payment terms. A payment terms has following data
model:
id: Auto-generated unique-id
code: Abbreviation for payment-term (text-type)
description: Text Type
creationDate: Date when the payment-term is created, should be populated automatically.
days: Number of days applicable for the payment term
remindBeforeDays: Number of days before the invoice due date that the system
should send a reminder to the customer.

The application should provide REST APIs to create, update, read and delete
a payment-term.
