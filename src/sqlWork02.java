USE dvdrental;

        SELECT*FROM film
        WHERE replacement cost BETWEEN 12.99 AND 16.99 ;

        SELECT a.first_name. a.last_name FROM actor a
        WHERE first_name IN ( 'Penelope','Nick', 'Ed' ) ;

        SELECT*FROM film
        WHERE rental_rate IN(0.99, 2.99, 4.99) AND replacement_cost IN(12.99, 15.99, 28.99 );
