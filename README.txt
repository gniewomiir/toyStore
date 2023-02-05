# projekt-zaliczenie-mrutkow1
projekt-zaliczenie-mrutkow1 created by GitHub Classroom


Projekt z wykorzystaniem SPRINGBOOTA,

Użyta baza danych:
MySQL W celu połączenia aplikacji z bazą danych:
Należy stworzyć baze o nazwie toy
Ewentualnie w pliku zmienić nazwe połączenia w pliku src/main/resources/application.properties jeśli chcemy użyć innej bazy
Tabele o nazwie toy z kolumnami :ID(primary key,not null,autoincrement, INT),name(not null, VARCHAR(100)),price(not null,VARCHAR(100))
Tabele o nazwie mytoys z kolumnami jw. z tą różnicą że przy ID nie zaznaczamy opcji AI


Aplikacja pozwala na:
-Dodanie nowej zabawki definiując ją nazwę oraz cenę.(ID jest ustawione jako AUTOINCREMENT)- zakładka Toy register

-Wyświetla liste wszystkich zabawek w bazie - Zakładka available toys

-Pozwala dodać zabawkę z listy wszystkich dostępnych(Available toys) po kliknięciu przycisku BUY (in progress) - rekordy lądują w tabeli my_toys i wyświetlane są w zakładce My Toys

założenie - jedna zabawka może być jeden raz zakupiona(przez brak czasu oraz umiejętności nie wiedziałem jak
ograć dokładnie system ilościowy w tym przypadku tak by nie wysypywał się w bazie danych),
dodatkowo w kodzie jest umiejscowiony zakomentowany przycisk ->resources/templates/myToys.html - linia 56 - pozwala on na usunięcie rekordu z listy gdyby była taka potrzeba.

-usuwanie rekordu z bazy

Braki na ten moment z założeniem projektu:
-otwieranie pliku XML
-brak unit testów

Znane błędy:
-Brak przyznawania id od 1 po usunięciu zabawki z tabeli toys(większa rzecz do zastanowienia jeśli przy okazji id jest
pokazywane w liście My Toys po zakupie)

Do poprawienia:
-Brak jakiegokolwiek pop-upu dla użytkownika gdy próbuje zakupić ponownie tą samą zabawkę()
-Dodać pole ilości w tabelach SQL



