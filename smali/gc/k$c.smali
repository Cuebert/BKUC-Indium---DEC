.class final Lgc/k$c;
.super Lgc/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgc/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseT:",
        "Ljava/lang/Object;",
        ">",
        "Lgc/k<",
        "TResponseT;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final d:Lgc/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgc/c<",
            "TResponseT;",
            "Lgc/b<",
            "TResponseT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lgc/s;Lob/g$a;Lgc/f;Lgc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/s;",
            "Lob/g$a;",
            "Lgc/f<",
            "Lob/j0;",
            "TResponseT;>;",
            "Lgc/c<",
            "TResponseT;",
            "Lgc/b<",
            "TResponseT;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lgc/k;-><init>(Lgc/s;Lob/g$a;Lgc/f;)V

    .line 2
    iput-object p4, p0, Lgc/k$c;->d:Lgc/c;

    return-void
.end method


# virtual methods
.method protected c(Lgc/b;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/b<",
            "TResponseT;>;[",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lgc/k$c;->d:Lgc/c;

    invoke-interface {v0, p1}, Lgc/c;->b(Lgc/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgc/b;

    .line 2
    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    aget-object p2, p2, v0

    check-cast p2, Lva/c;

    .line 3
    :try_start_0
    invoke-static {p1, p2}, Lgc/m;->c(Lgc/b;Lva/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 4
    invoke-static {p1, p2}, Lgc/m;->d(Ljava/lang/Exception;Lva/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
