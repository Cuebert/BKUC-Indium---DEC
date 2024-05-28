.class public Lz2/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method synthetic constructor <init>(Lz2/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lz2/o;
    .locals 3

    new-instance v0, Lz2/o;

    iget-object v1, p0, Lz2/o$a;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz2/o;-><init>(Ljava/lang/String;Lz2/r;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lz2/o$a;
    .locals 0

    iput-object p1, p0, Lz2/o$a;->a:Ljava/lang/String;

    return-object p0
.end method
