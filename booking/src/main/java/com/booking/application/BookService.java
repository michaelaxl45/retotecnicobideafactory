package com.booking.application;

import com.booking.domain.entities.Book;
import com.booking.domain.dto.response.BookResponse;

public interface BookService {
    BookResponse create(Book bookRequest);
}
