.class public Li7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/c;


# instance fields
.field private actionType:Ljava/lang/String;

.field private code:Ljava/lang/String;

.field private rememberDevice:Z

.field private ticket:Ljava/lang/String;

.field private username:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li7/b;->username:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Li7/b;->ticket:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Li7/b;->code:Ljava/lang/String;

    .line 5
    iput-boolean p4, p0, Li7/b;->rememberDevice:Z

    .line 6
    iput-object p5, p0, Li7/b;->actionType:Ljava/lang/String;

    return-void
.end method
