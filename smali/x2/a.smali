.class public final Lx2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx2/a$f;,
        Lx2/a$b;,
        Lx2/a$g;,
        Lx2/a$c;,
        Lx2/a$d;,
        Lx2/a$a;,
        Lx2/a$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lx2/a$d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lx2/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a$a<",
            "*TO;>;"
        }
    .end annotation
.end field

.field private final b:Lx2/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a$g<",
            "*>;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lx2/a$a;Lx2/a$g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lx2/a$f;",
            ">(",
            "Ljava/lang/String;",
            "Lx2/a$a<",
            "TC;TO;>;",
            "Lx2/a$g<",
            "TC;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Cannot construct an Api with a null ClientBuilder"

    invoke-static {p2, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Cannot construct an Api with a null ClientKey"

    .line 2
    invoke-static {p3, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lx2/a;->c:Ljava/lang/String;

    iput-object p2, p0, Lx2/a;->a:Lx2/a$a;

    iput-object p3, p0, Lx2/a;->b:Lx2/a$g;

    return-void
.end method


# virtual methods
.method public final a()Lx2/a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx2/a$a<",
            "*TO;>;"
        }
    .end annotation

    iget-object v0, p0, Lx2/a;->a:Lx2/a$a;

    return-object v0
.end method

.method public final b()Lx2/a$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx2/a$c<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lx2/a;->b:Lx2/a$g;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx2/a;->c:Ljava/lang/String;

    return-object v0
.end method
