.class final Lgc/k$a;
.super Lgc/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgc/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseT:",
        "Ljava/lang/Object;",
        "ReturnT:",
        "Ljava/lang/Object;",
        ">",
        "Lgc/k<",
        "TResponseT;TReturnT;>;"
    }
.end annotation


# instance fields
.field private final d:Lgc/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgc/c<",
            "TResponseT;TReturnT;>;"
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
            "TResponseT;TReturnT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lgc/k;-><init>(Lgc/s;Lob/g$a;Lgc/f;)V

    .line 2
    iput-object p4, p0, Lgc/k$a;->d:Lgc/c;

    return-void
.end method


# virtual methods
.method protected c(Lgc/b;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/b<",
            "TResponseT;>;[",
            "Ljava/lang/Object;",
            ")TReturnT;"
        }
    .end annotation

    iget-object p2, p0, Lgc/k$a;->d:Lgc/c;

    invoke-interface {p2, p1}, Lgc/c;->b(Lgc/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
