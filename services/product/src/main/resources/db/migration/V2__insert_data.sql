INSERT INTO category (id, description, name)
VALUES
    (nextval('category_seq'), 'Electronics', 'Electronics'),
    (nextval('category_seq'), 'Clothing', 'Clothing'),
    (nextval('category_seq'), 'Home & Kitchen', 'Home & Kitchen');

INSERT INTO product (id, description, name, available_quantity, price, category_id)
VALUES
    (nextval('product_seq'), 'Smartphone', 'iPhone 13', 100, 799.99, (SELECT id FROM category WHERE name = 'Electronics')),
    (nextval('product_seq'), 'Laptop', 'MacBook Pro', 50, 1999.99, (SELECT id FROM category WHERE name = 'Electronics')),
    (nextval('product_seq'), 'T-Shirt', 'Cotton T-Shirt', 200, 19.99, (SELECT id FROM category WHERE name = 'Clothing')),
    (nextval('product_seq'), 'Jeans', 'Slim Fit Jeans', 150, 49.99, (SELECT id FROM category WHERE name = 'Clothing')),
    (nextval('product_seq'), 'Blender', 'High-Speed Blender', 75, 99.99, (SELECT id FROM category WHERE name = 'Home & Kitchen')),
    (nextval('product_seq'), 'Coffee Maker', 'Drip Coffee Maker', 60, 59.99, (SELECT id FROM category WHERE name = 'Home & Kitchen'));