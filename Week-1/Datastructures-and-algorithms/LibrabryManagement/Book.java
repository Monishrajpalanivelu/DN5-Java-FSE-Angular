public class Book{

static int linearSearch(String books[],String key){

for(int i=0;i<books.length;i++)
if(books[i].equals(key))
return i;

return -1;
}

}