ct(other)
        if maybe_constructable is None:
            return NotImplemented
        self.extend(maybe_constructable)
        return self

    def __or__(self, other: object) -> Self:
        # Supports merging header dicts using operator |
        # combining items with add instead of __setitem__
        maybe_constructable = ensure_can_construct_http_header_dict(other)
        if maybe_constructable is None:
            return NotImplemented
        result = self.copy()
        result.extend(maybe_constructable)
        return result

    def __ror__(self, other: object) -> Self:
        # Supports merging header dicts using operator | when other is on left side
        # combining items with a