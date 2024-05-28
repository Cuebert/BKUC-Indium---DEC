.class Ln5/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln5/d;->i()Ll5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln5/d;


# direct methods
.method constructor <init>(Ln5/d;)V
    .locals 0

    iput-object p1, p0, Ln5/d$a;->a:Ln5/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 2
    :try_start_0
    invoke-virtual {p0, p1, v0}, Ln5/d$a;->b(Ljava/lang/Object;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;Ljava/io/Writer;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v6, Ln5/e;

    iget-object v0, p0, Ln5/d$a;->a:Ln5/d;

    .line 2
    invoke-static {v0}, Ln5/d;->e(Ln5/d;)Ljava/util/Map;

    move-result-object v2

    iget-object v0, p0, Ln5/d$a;->a:Ln5/d;

    invoke-static {v0}, Ln5/d;->f(Ln5/d;)Ljava/util/Map;

    move-result-object v3

    iget-object v0, p0, Ln5/d$a;->a:Ln5/d;

    invoke-static {v0}, Ln5/d;->g(Ln5/d;)Ll5/d;

    move-result-object v4

    iget-object v0, p0, Ln5/d$a;->a:Ln5/d;

    invoke-static {v0}, Ln5/d;->h(Ln5/d;)Z

    move-result v5

    move-object v0, v6

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Ln5/e;-><init>(Ljava/io/Writer;Ljava/util/Map;Ljava/util/Map;Ll5/d;Z)V

    const/4 p2, 0x0

    .line 3
    invoke-virtual {v6, p1, p2}, Ln5/e;->f(Ljava/lang/Object;Z)Ln5/e;

    .line 4
    invoke-virtual {v6}, Ln5/e;->m()V

    return-void
.end method
