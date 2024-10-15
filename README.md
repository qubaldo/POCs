# Spring Boot and PostgreSQL Example with Maven

## Overview

We will build a **Spring Boot + PostgreSQL + REST CRUD API** for a Tutorial application in which:

- Each **Tutorial** has:
  - `id`
  - `title`
  - `description`
  - `published` status

- APIs allow you to:
  - Create, retrieve, update, and delete Tutorials
  - Use custom finder methods such as finding by published status or by title

## APIs to be Provided

| Method | URL                                | Action                                        |
|--------|------------------------------------|-----------------------------------------------|
| POST   | `/api/tutorials`                   | Create a new Tutorial                         |
| GET    | `/api/tutorials`                   | Retrieve all Tutorials                        |
| GET    | `/api/tutorials/:id`               | Retrieve a Tutorial by `id`                   |
| PUT    | `/api/tutorials/:id`               | Update a Tutorial by `id`                     |
| DELETE | `/api/tutorials/:id`               | Delete a Tutorial by `id`                     |
| DELETE | `/api/tutorials`                   | Delete all Tutorials                          |
| GET    | `/api/tutorials/published`         | Find all published Tutorials                  |
| GET    | `/api/tutorials?title=[keyword]`   | Find all Tutorials with titles containing the keyword |

---

Feel free to clone this repository and follow along to build your own Spring Boot and PostgreSQL RESTful API!
