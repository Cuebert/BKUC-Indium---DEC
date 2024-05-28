.class public Lc7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc7/a$e;,
        Lc7/a$f;,
        Lc7/a$d;,
        Lc7/a$c;,
        Lc7/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected a:I

.field private b:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TT;"
        }
    .end annotation
.end field

.field private c:Le5/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le5/d<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;Z)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lc7/a$e;->a()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lc7/a;->b:[Ljava/lang/Object;

    const/4 v1, 0x0

    .line 4
    aput-object p2, v0, v1

    .line 5
    iput v1, p0, Lc7/a;->a:I

    if-eqz p3, :cond_0

    .line 6
    invoke-static {p1}, Le5/d;->d(Ljava/lang/Object;)Le5/d;

    move-result-object p1

    iput-object p1, p0, Lc7/a;->c:Le5/d;

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {}, Le5/d;->a()Le5/d;

    move-result-object p1

    iput-object p1, p0, Lc7/a;->c:Le5/d;

    :goto_0
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;ZLc7/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lc7/a;-><init>(Ljava/lang/String;Ljava/lang/Object;Z)V

    return-void
.end method

.method private f(I)V
    .locals 1

    :goto_0
    if-ltz p1, :cond_1

    .line 1
    iget-object v0, p0, Lc7/a;->b:[Ljava/lang/Object;

    aget-object v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lc7/a;->a:I

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lc7/a;->c:Le5/d;

    invoke-virtual {v0}, Le5/d;->c()Z

    move-result v0

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lc7/a;->c:Le5/d;

    const-string v1, ""

    invoke-virtual {v0, v1}, Le5/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public c(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lc7/a;->e(Ljava/lang/Object;I)V

    return-void
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lc7/a;->a:I

    return v0
.end method

.method public e(Ljava/lang/Object;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation

    if-nez p2, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lc7/a;->b:[Ljava/lang/Object;

    aput-object p1, v0, p2

    .line 2
    iget v0, p0, Lc7/a;->a:I

    if-lt p2, v0, :cond_2

    if-nez p1, :cond_1

    .line 3
    invoke-direct {p0, v0}, Lc7/a;->f(I)V

    goto :goto_0

    .line 4
    :cond_1
    iput p2, p0, Lc7/a;->a:I

    :cond_2
    :goto_0
    return-void
.end method

.method public g()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lc7/a;->b:[Ljava/lang/Object;

    iget v1, p0, Lc7/a;->a:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public h(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Lc7/a;->b:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method
