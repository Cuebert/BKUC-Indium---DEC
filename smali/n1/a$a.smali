.class public final Ln1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method synthetic constructor <init>(Ln1/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ln1/a;
    .locals 3

    .line 1
    iget-object v0, p0, Ln1/a$a;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v1, Ln1/a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ln1/a;-><init>(Ln1/a0;)V

    .line 2
    invoke-static {v1, v0}, Ln1/a;->c(Ln1/a;Ljava/lang/String;)V

    return-object v1

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Purchase token must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Ljava/lang/String;)Ln1/a$a;
    .locals 0

    iput-object p1, p0, Ln1/a$a;->a:Ljava/lang/String;

    return-object p0
.end method
