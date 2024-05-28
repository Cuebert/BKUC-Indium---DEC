.class public final Ld2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld2/a$a;
    }
.end annotation


# static fields
.field private static final e:Ld2/a;


# instance fields
.field private final a:Ld2/f;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld2/d;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ld2/b;

.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld2/a$a;

    invoke-direct {v0}, Ld2/a$a;-><init>()V

    invoke-virtual {v0}, Ld2/a$a;->b()Ld2/a;

    move-result-object v0

    sput-object v0, Ld2/a;->e:Ld2/a;

    return-void
.end method

.method constructor <init>(Ld2/f;Ljava/util/List;Ld2/b;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld2/f;",
            "Ljava/util/List<",
            "Ld2/d;",
            ">;",
            "Ld2/b;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ld2/a;->a:Ld2/f;

    .line 3
    iput-object p2, p0, Ld2/a;->b:Ljava/util/List;

    .line 4
    iput-object p3, p0, Ld2/a;->c:Ld2/b;

    .line 5
    iput-object p4, p0, Ld2/a;->d:Ljava/lang/String;

    return-void
.end method

.method public static e()Ld2/a$a;
    .locals 1

    new-instance v0, Ld2/a$a;

    invoke-direct {v0}, Ld2/a$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Lo5/d;
        tag = 0x4
    .end annotation

    iget-object v0, p0, Ld2/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ld2/b;
    .locals 1
    .annotation build Lo5/d;
        tag = 0x3
    .end annotation

    iget-object v0, p0, Ld2/a;->c:Ld2/b;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld2/d;",
            ">;"
        }
    .end annotation

    .annotation build Lo5/d;
        tag = 0x2
    .end annotation

    iget-object v0, p0, Ld2/a;->b:Ljava/util/List;

    return-object v0
.end method

.method public d()Ld2/f;
    .locals 1
    .annotation build Lo5/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Ld2/a;->a:Ld2/f;

    return-object v0
.end method

.method public f()[B
    .locals 1

    invoke-static {p0}, La2/l;->a(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method
