/* Requirements:
- Currently using java version 16.0.2
- Eclipse Version: 2021-06 (4.20.0)
- MongoDB compass: version 1.44.4

MongoClient is the interface between Java program and MongoDB server. It used to create connection, connect to database, retrieve collection names. Performs all the CRUD operations on Collections and documents in MongoDB
*/




package mongoJava;

import java.awt.Cursor;

import org.bson.Document;
import com.mongodb.client.MongoCursor;

import com.mongodb.client.MongoClient;
//import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;




public class MongoCon {
	public static void main(String[] args) {
		//Create mongoDb client
		MongoClient mongo = MongoClients.create();
		System.out.println("Connection successful");
		
	//If the database is no existing in that particular collection, then it automatically creates if we write line 24
		MongoDatabase db = mongo.getDatabase("mydb");
		
	//To get all the collections / database names present in the Collection:
		MongoCursor<String> dbnames = mongo.listDatabaseNames().iterator(); 
		while(dbnames.hasNext()) {
			System.out.println(dbnames.next());
		}
		
	//connecting to one of the existing collection
		MongoCollection<Document> collection = db.getCollection("student");
		
		//insert one document
		/*Document doc = new Document("_id", 1241)
				.append("sname", "Smith")
				.append("marks", 73);
		collection.insertOne(doc);
		
		*/
		
		//Retrieving first existing document(record)
		Document mydoc = collection.find().first();
		System.out.println("First record:" +mydoc.toJson());
		
		//Retrieving all the documents(records) existing in the collection(database name)
		
		//MongoCursor<Document> cursor = collection.find().iterator();
		
			for (Document cur : collection.find()) {
			    System.out.println(cur.toJson());
			}
		
		
		
		
		
		
	}

}
