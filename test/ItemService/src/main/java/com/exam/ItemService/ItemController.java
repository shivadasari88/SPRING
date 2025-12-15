package com.exam.ItemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/items")
public class ItemController {
	
	@Autowired
	public ItemRepository itemRepo;
	
	@PostMapping
	public String createItems(@RequestBody Item item) {
		
		itemRepo.save(item);
		return "item created successfully";
		
		
	}
	
	@GetMapping
	public List<Item> getItems(){
		List<Item> items = itemRepo.findAll();
		
		return items;
	}
	
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable int id) {
        return itemRepo.getById(id);
    }
    
    
    @PutMapping("/{id}")
    public Item updateItem(@PathVariable int id,@RequestBody Item updatedItem) {
    	Item book = getItemById(id);
        book.setItemName(updatedItem.getItemName());
        book.setPrice(updatedItem.getPrice());
        book.setStock(updatedItem.getStock());
        return itemRepo.save(book);
    }
    
    @DeleteMapping("{id}")
    public String deleteItem(@PathVariable int id) {
    	itemRepo.deleteById(id);
    	
    	return "ItemDeleted Successfully";
    }
}
