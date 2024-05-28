.class public Lv9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final c:Lv9/a;


# direct methods
.method public constructor <init>(Lgc/t;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/t<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "ApiResponse"

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Lgc/t;->b()I

    move-result v1

    iput v1, p0, Lv9/b;->a:I

    .line 3
    invoke-virtual {p1}, Lgc/t;->f()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {p1}, Lgc/t;->a()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lv9/b;->b:Ljava/lang/Object;

    .line 5
    iput-object v2, p0, Lv9/b;->c:Lv9/a;

    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p1}, Lgc/t;->d()Lob/j0;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 7
    :try_start_0
    invoke-virtual {p1}, Lgc/t;->d()Lob/j0;

    move-result-object v1

    invoke-virtual {v1}, Lob/j0;->T()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error message: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-object v1, v2

    :catch_1
    const-string v3, "error while parsing response"

    .line 9
    invoke-static {v0, v3}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_2

    .line 10
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    .line 11
    :cond_2
    invoke-virtual {p1}, Lgc/t;->g()Ljava/lang/String;

    move-result-object v1

    .line 12
    :cond_3
    new-instance p1, Lv9/a;

    invoke-direct {p1, v1}, Lv9/a;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lv9/b;->c:Lv9/a;

    .line 13
    iput-object v2, p0, Lv9/b;->b:Ljava/lang/Object;

    :goto_1
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lv9/b;->c:Lv9/a;

    if-eqz v0, :cond_0

    iget v0, v0, Lv9/a;->a:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public b()Z
    .locals 2

    iget v0, p0, Lv9/b;->a:I

    const/16 v1, 0xc8

    if-lt v0, v1, :cond_0

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
