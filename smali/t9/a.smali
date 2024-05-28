.class public Lt9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/platform/NoObfuscate;


# instance fields
.field public notificationId:Ljava/lang/String;

.field public platformType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lt9/a;->platformType:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lt9/a;->notificationId:Ljava/lang/String;

    return-void
.end method
