INSERT INTO category (id, name, description)
VALUES
    (nextval('category_seq'), 'Electronics', 'Electronic devices and gadgets'),
    (nextval('category_seq'), 'Clothing', 'Men and women apparel'),
    (nextval('category_seq'), 'Books', 'Various genres of books'),
    (nextval('category_seq'), 'Furniture', 'Home and office furniture');

-- Insert sample products
INSERT INTO public.product (id, name, description, available_quantity, price, category_id)
VALUES
    (nextval('product_seq'), 'Laptop', 'High-performance laptop', 10, 1200.00, 1),
    (nextval('product_seq'), 'Smartphone', 'Latest model smartphone', 20, 800.00, 1),
    (nextval('product_seq'), 'T-Shirt', 'Cotton T-Shirt', 50, 15.99, 2),
    (nextval('product_seq'), 'Jeans', 'Denim jeans', 30, 45.00, 2),
    (nextval('product_seq'), 'Fiction Book', 'Best-selling fiction novel', 100, 20.00, 3),
    (nextval('product_seq'), 'Office Chair', 'Ergonomic office chair', 15, 150.00, 4),
    (nextval('product_seq'), 'Microwave Oven', '800W microwave with digital controls', 25, 99.99, 5),
    (nextval('product_seq'), 'Refrigerator', 'Double-door refrigerator', 10, 499.99, 5),
    (nextval('product_seq'), 'Action Figure', 'Superhero action figure', 50, 25.99, 6),
    (nextval('product_seq'), 'Board Game', 'Strategy board game for 2-4 players', 40, 30.00, 6),
    (nextval('product_seq'), 'Soccer Ball', 'FIFA-approved soccer ball', 35, 19.99, 7),
    (nextval('product_seq'), 'Tennis Racket', 'Lightweight tennis racket', 20, 80.00, 7),
    (nextval('product_seq'), 'Headphones', 'Noise-canceling wireless headphones', 15, 200.00, 1),
    (nextval('product_seq'), 'Tablet', '10-inch tablet with high-resolution display', 12, 300.00, 1),
    (nextval('product_seq'), 'Dress', 'Elegant evening dress', 20, 70.00, 2),
    (nextval('product_seq'), 'Cookbook', 'Healthy recipes for beginners', 50, 25.00, 3),
    (nextval('product_seq'), 'Bookshelf', 'Wooden bookshelf with 5 tiers', 10, 120.00, 4);