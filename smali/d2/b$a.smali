.class public final Ld2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ld2/e;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ld2/b$a;->a:Ld2/e;

    return-void
.end method


# virtual methods
.method public a()Ld2/b;
    .locals 2

    new-instance v0, Ld2/b;

    iget-object v1, p0, Ld2/b$a;->a:Ld2/e;

    invoke-direct {v0, v1}, Ld2/b;-><init>(Ld2/e;)V

    return-object v0
.end method

.method public b(Ld2/e;)Ld2/b$a;
    .locals 0

    iput-object p1, p0, Ld2/b$a;->a:Ld2/e;

    return-object p0
.end method
