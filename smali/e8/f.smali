.class public Le8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Le8/f;->d:I

    .line 3
    iput-object p1, p0, Le8/f;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Le8/f;->b:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Le8/f;->c:Z

    return-void
.end method
