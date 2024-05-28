.class public Li7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/c;


# instance fields
.field private birthday:Ljava/lang/String;

.field private captchaProvider:Ljava/lang/String;

.field private captchaToken:Ljava/lang/String;

.field private email:Ljava/lang/String;

.field private gender:Ljava/lang/String;

.field private password:Ljava/lang/String;

.field private username:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li7/f;->username:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Li7/f;->password:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Li7/f;->gender:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Li7/f;->birthday:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Li7/f;->email:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Li7/f;->captchaToken:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Li7/f;->captchaProvider:Ljava/lang/String;

    return-void
.end method
