.class final Lkb/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lva/e$a;
.implements Lva/e$b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lva/e$a;",
        "Lva/e$b<",
        "Lkb/m1;",
        ">;"
    }
.end annotation


# static fields
.field public static final n:Lkb/m1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkb/m1;

    invoke-direct {v0}, Lkb/m1;-><init>()V

    sput-object v0, Lkb/m1;->n:Lkb/m1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Ldb/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Ldb/p<",
            "-TR;-",
            "Lva/e$a;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lva/e$a$a;->a(Lva/e$a;Ljava/lang/Object;Ldb/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Lva/e$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lva/e$b<",
            "*>;"
        }
    .end annotation

    return-object p0
.end method

.method public i(Lva/e$b;)Lva/e$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lva/e$a;",
            ">(",
            "Lva/e$b<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lva/e$a$a;->b(Lva/e$a;Lva/e$b;)Lva/e$a;

    move-result-object p1

    return-object p1
.end method
