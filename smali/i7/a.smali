.class public Li7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/c;


# instance fields
.field private actionType:Ljava/lang/String;

.field private ticket:Ljava/lang/String;

.field private username:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li7/a;->username:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Li7/a;->ticket:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Li7/a;->actionType:Ljava/lang/String;

    return-void
.end method
