INSERT INTO category (id, name, description)
VALUES
    (nextval('category_seq'), 'Electronics', 'Electronic devices and gadgets'),
    (nextval('category_seq'), 'Clothing', 'Men and women apparel'),
    (nextval('category_seq'), 'Books', 'Various genres of books'),
    (nextval('category_seq'), 'Furniture', 'Home and office furniture');

-- Insert sample products
INSERT INTO public.product (id, name, description, available_quantity, price, category_id)
VALUES
    (nextval('product_seq'), 'Laptop', 'High-performance laptop', 10, 1200.00, (SELECT id FROM category WHERE name = 'Electronics')),
    (nextval('product_seq'), 'Smartphone', 'Latest model smartphone', 20, 800.00, (SELECT id FROM category WHERE name = 'Electronics')),
    (nextval('product_seq'), 'T-Shirt', 'Cotton T-Shirt', 50, 15.99, (SELECT id FROM category WHERE name = 'Clothing')),
    (nextval('product_seq'), 'Jeans', 'Denim jeans', 30, 45.00, (SELECT id FROM category WHERE name = 'Clothing')),
    (nextval('product_seq'), 'Fiction Book', 'Best-selling fiction novel', 100, 20.00, (SELECT id FROM category WHERE name = 'Books')),
    (nextval('product_seq'), 'Office Chair', 'Ergonomic office chair', 15, 150.00, (SELECT id FROM category WHERE name = 'Furniture')),
    (nextval('product_seq'), 'Bookshelf', 'Wooden bookshelf with 5 tiers', 10, 120.00, (SELECT id FROM category WHERE name = 'Furniture'));
