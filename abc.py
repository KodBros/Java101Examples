import scholarly
import mechanicalsoup

def reference_al(link):
    pass

def yayinlari_al(liste,max_yayin):
    search_query = scholarly.search_pubs_query('covid-19 "data mining"')
    for i in range(max_yayin):
        liste.append(next(search_query))
    return liste

def yayinlar_yazdir(liste):
    for i in liste:
        print(i)


def main():
    liste = yayinlari_al(list(),2)
    yayinlar_yazdir(liste)

# kanka önce bi test yapalım bakalım bu linki açabiliyor mu?
#reference_al("http://jamanetwork.com/journals/jama/article-abstract/2762028")

main()
