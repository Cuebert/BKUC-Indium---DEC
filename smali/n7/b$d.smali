.class public Ln7/b$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Ljava/net/Socket;

.field public d:I

.field final synthetic e:Ln7/b;


# direct methods
.method public constructor <init>(Ln7/b;)V
    .locals 0

    iput-object p1, p0, Ln7/b$d;->e:Ln7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
