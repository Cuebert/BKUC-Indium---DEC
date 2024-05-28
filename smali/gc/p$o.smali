.class final Lgc/p$o;
.super Lgc/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgc/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "o"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgc/p<",
        "Lob/c0$b;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lgc/p$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgc/p$o;

    invoke-direct {v0}, Lgc/p$o;-><init>()V

    sput-object v0, Lgc/p$o;->a:Lgc/p$o;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgc/p;-><init>()V

    return-void
.end method


# virtual methods
.method bridge synthetic a(Lgc/r;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p2, Lob/c0$b;

    invoke-virtual {p0, p1, p2}, Lgc/p$o;->d(Lgc/r;Lob/c0$b;)V

    return-void
.end method

.method d(Lgc/r;Lob/c0$b;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Lgc/r;->e(Lob/c0$b;)V

    :cond_0
    return-void
.end method
