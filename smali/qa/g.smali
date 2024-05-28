.class Lqa/g;
.super Lqa/y;
.source "SourceFile"


# instance fields
.field final a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lqa/y;-><init>()V

    .line 2
    iput-object p1, p0, Lqa/g;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public c(Lqa/w;)Z
    .locals 1

    iget-object p1, p1, Lqa/w;->d:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v0, "content"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(Lqa/w;I)Lqa/y$a;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance p2, Lqa/y$a;

    invoke-virtual {p0, p1}, Lqa/g;->j(Lqa/w;)Ljava/io/InputStream;

    move-result-object p1

    sget-object v0, Lqa/t$e;->p:Lqa/t$e;

    invoke-direct {p2, p1, v0}, Lqa/y$a;-><init>(Ljava/io/InputStream;Lqa/t$e;)V

    return-object p2
.end method

.method j(Lqa/w;)Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa/g;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 2
    iget-object p1, p1, Lqa/w;->d:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method
