Application de Paiement des Étudiants
Bienvenue dans l'Application de Paiement des Étudiants ! Ce README fournit un aperçu des fonctionnalités de l'application, de la documentation backend et frontend, des étapes pour commencer, de l'utilisation de l'application, et des informations sur la contribution.

Aperçu des Fonctionnalités
Visualiser la liste des étudiants et de leurs paiements.
Importer la liste des étudiants et des paiements.
Vérifier les informations d'un étudiant par son code.
Obtenir la liste des étudiants par leur programme d'études.
Obtenir les paiements par statut ou type.
Obtenir un paiement par ID.
Obtenir le paiement d'un étudiant par son code.
Mettre à jour le statut d'un paiement.
Ajouter un nouveau paiement étudiant.


Application de Paiement des Étudiants
Bienvenue dans l'Application de Paiement des Étudiants ! Ce README fournit un aperçu des fonctionnalités de l'application, de la documentation backend et frontend, des étapes pour commencer, de l'utilisation de l'application, et des informations sur la contribution.

Aperçu des Fonctionnalités
Visualiser la liste des étudiants et de leurs paiements.
Importer la liste des étudiants et des paiements.
Vérifier les informations d'un étudiant par son code.
Obtenir la liste des étudiants par leur programme d'études.
Obtenir les paiements par statut ou type.
Obtenir un paiement par ID.
Obtenir le paiement d'un étudiant par son code.
Mettre à jour le statut d'un paiement.
Ajouter un nouveau paiement étudiant.
Documentation Backend
Points d'Accès
Explorez les points d'accès de l'API via Swagger-UI :

GET /students/all: Récupérer tous les étudiants.
GET /students/{programId}: Récupérer les étudiants par programme d'études.
GET /students/{code}: Récupérer les informations d'un étudiant par son code.
GET /payments/all: Récupérer tous les paiements.
GET /payments/status/{status}: Récupérer les paiements par statut.
GET /payments/type/{type}: Récupérer les paiements par type.
GET /payment/{id}: Récupérer un paiement par ID.
GET /payments/student/{code}: Récupérer les paiements par code étudiant.
PUT /payments/{id}: Mettre à jour le statut d'un paiement.
POST /payments/new: Ajouter un nouveau paiement étudiant.