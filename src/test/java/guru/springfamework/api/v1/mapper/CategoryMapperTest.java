package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.domain.Category;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CategoryMapperTest {

    private static final long ID = 1L;
    private static final String NAME = "TestCategory";
    private CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
    public void categoryToCategoryDTO() {
        // given
        Category category = new Category();
        category.setId(ID);
        category.setName(NAME);

        // when
        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        // then
        assertEquals(Long.valueOf(ID), categoryDTO.getId());
        assertEquals(NAME, categoryDTO.getName());
    }
}