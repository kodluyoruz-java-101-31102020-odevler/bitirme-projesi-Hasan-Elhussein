CREATE DATABASE IF NOT EXISTS bitirme_projesi_hasan_elhussein_db;
USE bitirme_projesi_hasan_elhussein_db;

CREATE TABLE IF NOT EXISTS books(
	book_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    book_name VARCHAR(255) NOT NULL,
    author_name VARCHAR(255),
    book_description VARCHAR(255),
    book_note VARCHAR(255),
    book_page_count INT,
    book_publication_date date
);

INSERT INTO `books` (`book_name`, `author_name`, `book_description`, `book_note`, `book_page_count`,`book_publication_date`) VALUES
('AAA', 'Ali', 'AAA kitabi', 'A oldukca guzel bir kitab', 200, '2020-01-01'),
('BBB', 'Bilal', 'BBB kitabi', 'B oldukca guzel bir kitab', 150, '2019-01-01'),
('CCC', 'Can', 'CCC kitabi', 'C oldukca guzel bir kitab', 100, '2018-01-01'),
('DDD', 'Deniz', 'DDD kitabi', 'D oldukca guzel bir kitab', 50, '2017-01-01')
;