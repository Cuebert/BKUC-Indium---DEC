.class public Lub/f$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lub/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field a:Ljava/net/Socket;

.field b:Ljava/lang/String;

.field c:Lac/e;

.field d:Lac/d;

.field e:Lub/f$j;

.field f:Lub/l;

.field g:Z

.field h:I


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lub/f$j;->a:Lub/f$j;

    iput-object v0, p0, Lub/f$h;->e:Lub/f$j;

    .line 3
    sget-object v0, Lub/l;->a:Lub/l;

    iput-object v0, p0, Lub/f$h;->f:Lub/l;

    .line 4
    iput-boolean p1, p0, Lub/f$h;->g:Z

    return-void
.end method


# virtual methods
.method public a()Lub/f;
    .locals 1

    new-instance v0, Lub/f;

    invoke-direct {v0, p0}, Lub/f;-><init>(Lub/f$h;)V

    return-object v0
.end method

.method public b(Lub/f$j;)Lub/f$h;
    .locals 0

    iput-object p1, p0, Lub/f$h;->e:Lub/f$j;

    return-object p0
.end method

.method public c(I)Lub/f$h;
    .locals 0

    iput p1, p0, Lub/f$h;->h:I

    return-object p0
.end method

.method public d(Ljava/net/Socket;Ljava/lang/String;Lac/e;Lac/d;)Lub/f$h;
    .locals 0

    .line 1
    iput-object p1, p0, Lub/f$h;->a:Ljava/net/Socket;

    .line 2
    iput-object p2, p0, Lub/f$h;->b:Ljava/lang/String;

    .line 3
    iput-object p3, p0, Lub/f$h;->c:Lac/e;

    .line 4
    iput-object p4, p0, Lub/f$h;->d:Lac/d;

    return-object p0
.end method
