ses.
}

void Win32Window::UpdateTheme(HWND const window) {
  DWORD light_mode;
  DWORD light_mode_size = sizeof(light_mode);
  LSTATUS result = RegGetValue(HKEY_CURRENT_USER, kGetPreferredBrightnessRegKey,
                               kGetPreferredBrightnessRegValue,
                               RRF_RT_REG_DWORD, nullptr, &light_mode,
                               &light_mode_size);

  if (result == ERROR_SUCCESS) {
    BOOL enable_dark_mode = light_mode == 0;
    DwmSetWindowAttribute(window, DWMWA_USE_IMMERSIVE_DARK_MODE,
                          &enable_dark_mode, sizeof(enable_dark_mode));
  }
}
                                                                                                                                                                                                                                                                                                                                                                                                          �Hc���}�t������IQ0#|�|�����L�|� ��M~FR����y�Wۊ�|fS�J���ʚ%�_�Bs�l�op��뒾 i���9Ǳt��I
D�|Cl$~ ��O�b�Z~W ���� �}���˸x?_�g6���̺���>�F��'=�A��W �s�׏,_���<KvP���(K����#��O����o��u�bw}�u 
�>PI&l��!������W����W7��JaOg�<�����M/v���r__�n���R�Adg<�[��
������F8�>U�/�q��	�f�ޙl�^��hM�2]�~5��q�c�M�����`6j��l̓F�F:�mU@��b��&��Z3�d�%K��H�C��y�iM���~����.g 4����ДОhӚǸ�ʀM~=;��)଀��p<��m��T�8e�#'d��꛷���V`g�Bf����
��kJcA���>�kv�`j��x�"s]Ah�N�M���]b?F��Ȉ�6uy46*����}���z�nG�nP�8�y+����T���h���`�J�R8S���!�k}�    IDAT�m�����ZS.ڛ�$���O��kͩj��	���O���~�a$��D����	8
�?zDb�$J)�5l pS�����E}׬H��/�L�u®4L�c$I*��x��|d ���iN�Mdd����ݬ����%�\R/��4䘮��x���*���.��O�N��s����O]/�)������	��"���ɳ8ЁЗL����!�I�ĳz�����O���Ti�y�)����*�&���00}�5�6�!�)��k�'�g��̴�\q�M�s����];{J�ꏬ�ޯ�{V�}4j�`����j�Wg[����gֻ����/}��^Χ�%�/2� �Bdx����t������1��
��{�z/�>V�{A/�P��q]\��5f��O>��_\C,0�q���?t��l����x���(;���|���_�;��u����{����;����;\=~` ���~�~��r����PTp������G� �?��ŝy��y���Ğ�W���i���Q�i����Y�7���
8X��B鯜v���nUjNz߆��n��d���4������i���H�u��C�� ���᫟vf��Q~�W�S�_��\��2�c
/t�`m:eΜ�L]$?�qņH@�:88h�4�P��z�+���>�Z����#P)�a+����2�t�M�|�,c�%:���������� 4��jS�4�sZ7���N��1��^q�u#�!7 @�����0��j��,�����T`��S��Љ��᫇�����}�׵�$��������G��a(b?�p��9�o�m��B^�	�!+Ȇ�~��)>��um�>����70dB37́4w:L���F��q
��M��ೖ�m����V�~�25&�6�dw�����SOF*um��	�n7c����׻ٖ��a�t`��se<��{������,�F3u|�n��WӸ��h=ɉ]�u�S����ǘf�f�f�;u,���xn�dx]���;+��}<t�����dϰ��J�D�0��4.(��͞U����3�<�#*j[%�7�$����r�]��dߞY�*سr�k;�4�.=��O���0��Q]l�W����}/�O �s�5@O���DZ�7]A����r�sOC��.}Z��� ��޹4��}I/��{y��jh��1�k�!6�|���MR �0��8v��,����^�����P����g����o����% ��W^����[c8��k_�r��_{T_��۠���������!��(�� 6�� T8P��5X�+=�P@h ֆB��/�X�C0��Im�>KO��D�gQO0����֨�%�)���{u��m����3!H�n���F��5�1�9t���

��Nj��T�3�_�zI�n�̀��n�F]�{����'#��;_�&���H���+�蝧�a~�x� 9pKJ��0�V��>�����*@��r��~�<��BK�D����c�7�r��4���s@��mh�I� j��:N�߃E�/M6�mY�hG�}���